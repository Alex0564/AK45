package hw4;

public class Homework4 {
    public static void main(String[] args) {

        // Homework for Lesson 4 Loops

        int[] myNum = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
        for (int v : myNum) {
            System.out.println(v);
        }
        System.out.println("**********************************");
        for (int v : myNum) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
        System.out.println("**********************************");
        for (int v : myNum) {
            if (v % 3 == 0) {
                System.out.println(v);
            }
        }
        System.out.println("**********************************");
        int max = myNum[0];
        for (int v : myNum) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("The max number is " + max);
        System.out.println("**********************************");
        int min = myNum[0];
        for (int v : myNum) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println("The min number is " + min);
        System.out.println("**********************************");
        for (int v : myNum) {
            if (v % 2 != 0) {
                System.out.println(v);
            }
        }
        System.out.println("**********************************");
        int[] numbers = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        for (int v : numbers) {
            if (v == 10) {
                System.out.println(v);
            }
        }
        System.out.println("**********************************");
        int[] numbers1 = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == 10)
                System.out.println(i);
        }
        System.out.println("**********************************");
        // My version
        int[] numbers2 = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int i = 0;
        for (int v : numbers2) {
            if (v == 10) {
                System.out.println(i++);
            } else {
                i = i + 1;
            }
        }
        System.out.println("**********************************");
        // updated by a teacher
        int[] numbers3 = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int index = 0;
        for (int v : numbers3) {
            if (v == 10) {
                System.out.println(index);
            }
            index++;
        }
    }
}
