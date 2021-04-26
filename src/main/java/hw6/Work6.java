package hw6;

import java.util.Arrays;
import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        //        1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
        //                вызовите этот метод из функции main() - подайте в качестве параметра {2,3,5,6,7,8}
        //        2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
        //                вызовите этот метод внутри функции main()
        //        подайте в качестве параметра {3,9,1,8,4,8,5}
        //        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
        //        подайте в качестве параметра {3,9,1,8,4,8,5}

        /*
        Задача - дан массив- array- чисел. Числа идут не по порядку. Необходимо отсортировать по возрастанию.
        Как будем действовать?{3,9,1,8,4,8,5} Будет два цикла.

         Логика такая - нужно взять [i=0] первое число (3) из массива и сравнить с соседним [i]=[i+1](справа 9).
         Если первое число больше соседнего то их нужно поменять местами. Если нет, то переходим к следующему числу i/
        Для этого передаем значение соседнего числа во временную переменную (например temp),
        сразу после этого соседнее число заменяется первым. А первое число значением из temp.
        То есть нужно протолкнуть самое большое число вправо. Если он самое большое - оно там останется (например 9),
        следом придет самое большое (8). И т.п.
        IF (number[i]>number[i+1] is true) THEN temp=number[i+1] and number[i+1]=number[i] and number[i]=temp
        ELSE go to the next i
        OK lets count
        [i] starts from 0 to (6-1)
        i=0
        What we have?Что у нас есть?

         array  {3,9,1,8,4,8,5}
         indexes 0 1 2 3 4 5 6
        let make a cycle/Создадим наш цикл:
        ---------------------------------
        i=0 number[0]=3, number[0+1]=9
        if(number[0]>number[0+1]) FALSE THEN go to next number[1]

        i=1 number[1]=9 number[1+1]=1
        if(number[1]>number[1+1]) TRUE THEN temp=number[1+1] and number[1+1]=number[1] and number[1]=temp
        now number[1+1]=9 number[1]=1

        i=2  number[2]=9 number[2+1]=8
        if(number[2]>number[2+1]) TRUE THEN temp=number[2+1] and number[2+1]=number[2] and number[2]=temp
        now number[2+1]=9 number[2]=8
        .
        .
        i=5  number[5]=9 number[5+1]=8
        if(number[5]>number[5+1]) TRUE THEN temp=number[5+1] and number[5+1]=number[5] and number[5]=temp
        now number[5+1]=9 number[5]=8
        ---------------------------------
        OK- we pushed maximal number to the right side

        This cycle need to do 6 times.
        Then put this cycle to the loop and repeat it 7 times according array's size
        Этот цикл нужно выполнить 7 раз - поэтому поместим этот цикл в другой цикл
        и выполнить 7 раз согласно размеру массива

        * */
        //task 1
        int[] myar ={2,3,5,6,7,8};
        System.out.println("=======task #1");
        sum(myar);
        ///
        System.out.println("sum of all values in array = "+ sumint(myar));

        //task 2
        myar=new int[] {3,9,1,8,4,8,5};
        System.out.println("=======task #2");
        sort(myar);
        ///building string from array -to print
        String  srtrow="";
        for (int v:sortar(myar)){
            System.out.println("Sorted array number = "+v);
            srtrow+=v;
        }
        System.out.println(srtrow);
        System.out.println(Arrays.toString(myar));
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is your name? >:");
        String name = scanner.nextLine();
        System.out.println("Hello! "+name);
        System.out.println("How old are you?"+name);
        int age= scanner.nextInt();
        if (age>18) {
            System.out.println("You are an adult!");
        } else
        {
            System.out.println("You are not and adult =)");
        }
        String res =  age>18 ? "You are an adult!": "You are NOT an adult!";
        System.out.println(res);

        //task 3
        System.out.println("=======task #3");
        System.out.println("Result for func1 Max(myar)");
        Max(myar);
        System.out.println("Result for func2 Min(myar)");
        Min(myar);
        System.out.println("Result for func3 MaxMin(myar)");
        MaxMin(myar);
        System.out.println("Result for func4 MaxMin(myar,operkey) - type 'min' to get minimal number or 'max' to get maximal number ");
        String key ="min";//String key ="min";
        MaxMin(myar,key);

    }

    //Functions for task 1
    //function #1
    public static void sum(int[] ar){
        int summachisel=0;
        for (int v:ar){
            summachisel+=v;
        }
        System.out.println("Sum of array= "+summachisel);
    }
    //function #2
    public static int sumint(int[] ar){
        int summachisel=0;
        for(int v:ar){
            summachisel+=v;
        }
        return  summachisel;
    }

    //Functions for task 2
    //function #1
    public static void sort(int[] ar){
        int temp; //temp value to replacing
        for(int v:ar) {
            for (int i=0; i<ar.length-1; i++)
            {
                if (ar[i] > ar[i + 1])
                {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for(int v:ar){
            System.out.println(v);}

    }
    //function #2
    public static int[] sortar(int[] ar){
        int temp; //temporary value for replacing
        for(int v:ar){
            for (int i=0;i<ar.length-1; i++){
                if (ar[i]>ar[i+1]){
                    temp=ar[i+1];
                    ar[i+1]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        return  ar;
    }


    //Functions for task 3
    ////function #1 - Max()
    public static void Max(int[] ar){
        int max=ar[0];
        for(int v:ar){
            if(max>v){
                max=v;
            }
        }
        System.out.println("Maximus is = "+max);
    }

    ////function #2 - Min()
    public static void Min(int[] ar){
        int min=ar[0];
        for(int v:ar){
            if(min<v){
                min=v;
            }
        }
        System.out.println("Minimum is = "+min);
    }

    ////function #3 - MaxMin() - array in params
    public static void MaxMin(int[] ar){
        int max=ar[0];
        for(int v:ar){
            if(max>v){
                max=v;
            }
        }
        System.out.println("Maximus is = "+max);

        int min=ar[0];
        for(int v:ar){
            if(min<v){
                min=v;
            }
        }
        System.out.println("Minimum is = "+min);

    }

    ////function #4 - MaxMin () - array in params and operation key(max/min)
    public static void MaxMin(int[] ar, String s){

        if (s=="max") {
            int max = ar[0];
            for (int v : ar) {
                if (max < v) {
                    max = v;
                }
            }
            System.out.println("Maximum is = " + max);
        } else if (s.equals("min")){

            int min = ar[0];
            for (int v : ar) {
                if (min > v) {
                    min = v;
                }
            }
            System.out.println("Minimum is = " + min);
        }else System.out.println("Error. Incorrect oper key. Type 'min' or 'max' (case sensitive)");
    }
}
