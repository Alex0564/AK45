package hw5;

public class Homework5 {

    public static void main(String[] args) {

        // Homework for Lesson 5 Functions 1

        printSumOfTwo(12, 34);

        int xx = sumOfTwo(23, 46);
        System.out.println("The sum of two numbers is " + xx);
        System.out.println("**********************************");

        System.out.println(isEven(2));                  // version 1 input
        System.out.println("**********************************");

        System.out.println(is_even(7));                 // version 2 input
        System.out.println("**********************************");
    }

    // sum of two numbers:
    public static void printSumOfTwo(int a, int b) {
        System.out.println("The sum of two numbers is " + (a + b));
        System.out.println("**********************************");
    }

    // sum of two numbers:
    public static int sumOfTwo(int a1, int a2) {
        int sum = a1 + a2;
        return sum;
    }

    // version 1 for function isEven:
    public static boolean isEven(int x) {
        return (x % 2) == 0;
        }

    // version 2 for function is_even:
    public static boolean is_even(int x) {
        return x % 2 == 0;
    }
}
