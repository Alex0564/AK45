package codewars;

public class App {
    public static void main(String[] args) {
//        Дано три различных по значению числовые величины.
//        Если величины расположены в порядке возрастания,
//        удвойте каждую величину, иначе присвойте каждой
//        величине противоположное значение.
//                Напишите функцию с именем newValues,
//                которая принимает три различных числа
//                a, b, c в качестве аргументов и возвращает
//                измененные значения в виде массива [a, b, c].
//        Примеры:
//        функция newValues(5, 6, 7) должна возвратить [10, 12, 14];
//        функция newValues(3, 0, -1) должна возвратить [-3, 0, 1];
//        функция newValues(-1, -2, 5) должна возвратить [1, 2, -5]].
//
        int[] arr = new int[3];
        arr = newValues(2, 14, 6);
        System.out.println("a= " + arr[0]);
        System.out.println("b= " + arr[1]);
        System.out.println("c= " + arr[2]);

//        Напишите функцию с именем numberSign, которая принимает
//        число num в качестве аргумента и возвращает "plus", если
//        число положительное, "minus", если число отрицательное,
//        или null, если число равно 0.
//              Примеры:
//        функция numberSign(5) должна возвратить "plus";
//        функция numberSign(-2) должна возвратить "minus";
//        функция numberSign(0) должна возвратить null.

        System.out.println(numberSign(5));
        System.out.println(numberSign(-2));
        System.out.println(numberSign(0));

//        Дано три числа. Найдите, сколько
//        среди них положительных чисел.
//          Напишите функцию с именем countOfPositive, которая принимает
//          три числа a, b, c в качестве аргументов и возвращает
//          количество положительных чисел в этом наборе.
//                Примеры:
//        функция countOfPositive(5, 13, 9) должна возвратить 3;
//        функция countOfPositive(-2, 7, 9) должна возвратить 2;
//        функция countOfPositive(-1, -7, 0) должна возвратить 0.

        System.out.println(countOfPositive(5,13,9));
        System.out.println(countOfPositive(-2,7,9));
        System.out.println(countOfPositive(-1,-7,0));

        int[] mas = {-2,5,6,0,1,-9,-7,12,0};
        System.out.println(countOfPositiveArray(mas));
    }
           public static int[] newValues (int a, int b, int c) {
               int[] re = new int[3];
               if (b >= a && b <= c) {re = new int[]{a * 2, b * 2, c * 2};}
               else { re = new int[]{-a, -b, -c};}
               return re; }

           public static String numberSign(int num){
               if (num == 0) {return null;}
               else if (num > 0) {return "plus";}
               return "minus"; }

           public static int countOfPositive(int a, int b, int c){
        int pos = 0;
               if (a>0) {pos=1;}
               if (b>0) {pos++;}
               if (c>0) {pos++;}
               return pos; }

    public static int countOfPositiveArray(int[] arr){
        int le = arr.length;
        int sum = 0;
        for (int i = 0; i < le; i++){
            if(arr[i]>0){sum++;}}
        return sum;
    }

}














