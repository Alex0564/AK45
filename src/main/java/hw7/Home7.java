package hw7;

public class Home7 {
    public static void main(String []args){
        System.out.println("Hello! This is my Homework!");
        int[] sum1 = {34,4,56,56,8};
        int[] sum2 = {45,4};

        int[] arr1 = {3, 9, 1, 8, 4, 8, 5};
        int max1 = max(arr1);
        int min1 = min(arr1);

        System.out.println(max1);
        System.out.println(min1);
        System.out.println(sum(sum1));
        System.out.println(sum(sum2));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int sum(int[]arr){
        int sum=0;
        for (int i=0; i<arr.length;i++)
            sum += arr[i];
        return sum;
    }
}

