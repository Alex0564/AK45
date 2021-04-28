package hw3;

public class Homework3 {

    public static void main(String[] args) {

        // Homework for Lesson 3 Arrays

        int[] numbers = {2, 76, 9, 90, 31, 76, 2, 76, 21, 12};
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[3]);
        System.out.println(numbers[5]);
        System.out.println(numbers[9]);
        System.out.println("**********************************");

        String[] items = new String[5];
        items[0] = "Desk";
        items[1] = "Lamp";
        items[2] = "Pen";
        items[3] = "Pencil";
        items[4] = "Tablet";

        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        System.out.println(items[3]);
        System.out.println(items[4]);
        System.out.println("**********************************");

        boolean[] condition = {true, 5 < 3, 4 >= 4, 3 < 5 && 2 == 3, 2 != 0 || 6 < 8};
        System.out.println(condition[0]);
        System.out.println(condition[1]);
        System.out.println(condition[2]);
        System.out.println(condition[3]);
        System.out.println(condition[4]);

    }

}
