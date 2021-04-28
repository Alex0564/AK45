package hw6;

public class Homework6_3 {

    public static void main(String[] args) {

        // Homework for Lesson 6 Functions 2 Problem 3 Finding Min & Max numbers

        int[] arr = {3, 9, 1, 8, 4, 8, 5, -16};
        int res = min(arr);
        System.out.println("Min number in array = " + res);
        System.out.println("***********************************");

        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        int res1 = min1(arr1);
        System.out.println("Min number in array1 = " + res1);
        System.out.println("***********************************");

        int[] arr3 = {3, 9, 1, 8, 4, 8, 34, -6, 5};
        int res3 = max(arr3);
        System.out.println("Max number in array3 = " + res3);
        System.out.println("***********************************");

        int[] arr4 = {3, 9, 1, 8, 4, 107, 8, 5};
        int res4 = max1(arr4);
        System.out.println("Max number in array4 = " + res4);
    }

    // The min number in array
    // version 1 using 'foreach' loop
    public static int min(int[] arr) {
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    // version 2 using 'for' loop
    public static int min1(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // The max number in array
    // version 1 using 'foreach' loop
    public static int max(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // version 2 using 'for' loop
    public static int max1(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
