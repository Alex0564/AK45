package hw6;

public class Homework6 {

    public static void main(String[] args) {

        // Homework for Lesson 6 Functions 2
        // Task 1 Sum of integers in array

        // sum of integers in array
        // version 1 using 'foreach' loop

        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int sum1 = 0;
        for (int i : arr1) {
            sum1 += i;
        }
        System.out.println("Sum of integers in arr1 =  " + sum1);
        System.out.println("*****************************");

        // version 2 using 'for' loop
        int[] arr2 = {2, 3, 5, 6, 7, 8};
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[i];
        }
        System.out.println("Sum of integers in arr2 = " + sum2);
        System.out.println("*****************************");

        // version 3 using function
        int[] arr = {2, 3, 5, 6, 7, 8};
        int sum = sumOfArray(arr);
        System.out.println("Sum of integers in arr = " + sum);
        System.out.println("*****************************");
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
