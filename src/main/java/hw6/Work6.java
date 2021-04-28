package hw6;

import java.util.Arrays;
import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        //       Task 1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
        //                вызовите этот метод из функции main() - подайте в качестве параметра {2,3,5,6,7,8}
        //       Task 2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
        //                вызовите этот метод внутри функции main()
        //        подайте в качестве параметра {3,9,1,8,4,8,5}
        //       Task 3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
        //        подайте в качестве параметра {3,9,1,8,4,8,5}


        //task 1
        int[] myar ={2,3,5,6,7,8};
        System.out.println("=======task #1");
        ///call function/mwthod sum()
        sum(myar);
        /// using another function/method sumint()
        System.out.println("sum of all values in array = "+ sumint(myar));

        //task 2
        myar=new int[] {3,9,1,8,4,8,5};
        System.out.println("=======task #2");
        ///call function/method sort()
        sort(myar);
        /// print array right after sorting
        System.out.println(Arrays.toString(myar));

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
    //function variant #1
    public static void sum(int[] ar){
        int summachisel=0;
        for (int v:ar){
            summachisel+=v;
        }
        System.out.println("Sum of array= "+summachisel);
    }
    //function variant #2
    public static int sumint(int[] ar){
        int summachisel=0;
        for(int v:ar){
            summachisel+=v;
        }
        return  summachisel;
    }

    //Functions for task 2
    //function variant #1
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
    //function variant #2
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
    ////function var #1 - Max()
    public static void Max(int[] ar){
        int max=ar[0];
        for(int v:ar){
            if(max>v){
                max=v;
            }
        }
        System.out.println("Maximum is = "+max);
    }

    ////function var #2 - Min()
    public static void Min(int[] ar){
        int min=ar[0];
        for(int v:ar){
            if(min<v){
                min=v;
            }
        }
        System.out.println("Minimum is = "+min);
    }

    ////function var #3 - MaxMin() - array in params
    public static void MaxMin(int[] ar){
        int max=ar[0];
        for(int v:ar){
            if(max>v){
                max=v;
            }
        }
        System.out.println("Maximum is = "+max);

        int min=ar[0];
        for(int v:ar){
            if(min<v){
                min=v;
            }
        }
        System.out.println("Minimum is = "+min);

    }

    ////function var #4 - MaxMin () - array in params and operation key(max/min)
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
