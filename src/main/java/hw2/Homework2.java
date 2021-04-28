package hw2;

public class Homework2 {

    public static void main(String[] args) {

        // Homework for Lesson 2 Boolean/ if else

        int a = 100;
        int x = 12;
        int d = 12;
        int c = 122;

        boolean zz1 = a == d;
        System.out.println("zz1=" + zz1);
        boolean zz2 = x == d;
        System.out.println("zz2=" + zz2);
        boolean zz3 = c >= a;
        System.out.println("zz3=" + zz3);
        boolean zz4 = x >= d;
        System.out.println("zz4=" + zz4);
        boolean zz5 = (d == c) || (x == d);
        System.out.println("zz5=" + zz5);
        boolean zz6 = (c > x) && (d >= x);
        System.out.println("zz6=" + zz6);
        boolean zz7 = (a > x) || (a > c);
        System.out.println("zz7=" + zz7);
        boolean zz8 = (a == c) && (d == c);
        System.out.println("zz8=" + zz8);
        boolean zz9 = (c == c) && (a <= a);
        System.out.println("zz9=" + zz9);
        boolean zz0 = (c > c) || (a <= a);
        System.out.println("zz0= " + zz0);
        boolean zz10 = (x > a) && (c == d);
        System.out.println("zz10=" + zz10);
        boolean zz11 = (c > a) && (x > d);
        System.out.println("zz11=" + zz11);

        System.out.println("*********************************");

        int passenger1 = 6;
        boolean condition1 = (passenger1 > 0) && (passenger1 <= 2);
        if (condition1) {
            System.out.println("Congratulations! Your ticket is free!");
        } else {
            System.out.println("Sorry, your ticket is not free!");
        }
        System.out.println("*********************************");

        int passenger2 = 2;

        boolean condition2 = (passenger2 > 2) && (passenger2 <= 12);

        if (condition2) {
            System.out.println("Congratulations, you have 50% discount on your ticket!");
        } else {
            System.out.println("Sorry, you can buy your ticket for full price!");
        }
        System.out.println("*********************************");

        int passenger3 = 11;

        boolean condition3 = (passenger3 > 12) && (passenger3 <= 65);

        if (condition3) {
            System.out.println("Your ticket is for full price!");
        } else {
            System.out.println("We need more info from you!");
        }
        System.out.println("*********************************");

         /* The curly braces {} marks the beginning and the end of a block of code
         Each code statement must end with a semicolon*/

        int age = 12;
        boolean cond1 = (age > 0) && (age <= 2);
        boolean cond2 = (age > 2) && (age <= 12);
        boolean cond3 = (age > 12) && (age <= 65);

        if (cond1) {
            System.out.println("Congratulations, your ticket is free!");
        } else if (cond2) {
            System.out.println("Congratulations, you have 50% discount on your ticket!");
        } else if (cond3) {
            System.out.println("You can buy your ticket for full price!");
        } else {
            System.out.println("You can buy your ticket with 20% dicount!");
        }

    }

}
