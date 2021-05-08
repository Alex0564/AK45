package practice;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // Member access and Inheritance

        Flower ff = new Flower("Camile", 6);
        ff.printInfo();
        System.out.println(ff.getYear());
        System.out.println(ff.getName());
        System.out.println(ff);
        System.out.println();

        Flower ff1 = new Flower("Tulip", 3);
        ff1.printInfo();
        System.out.println();

        Rose rr = new Rose("Rose", "White");
        rr.printInfo();
        System.out.println(rr.getName());
        System.out.println(rr.getColor());
        System.out.println();

        Tulip tt = new Tulip("Tulip", 7, "Pink", 20);
        tt.printInfo();
        System.out.println(tt.getYear());
        System.out.println();

        // Printing Array of enums using foreach loop

        Color[]chart = {Color.PINK,Color.RED, Color.VIOLET, Color.WHITE, Color.YELLOW};

        for (Color v : chart) {
            System.out.println(v);
        }
        // Printing Array of enums using Array

        System.out.println("***********************************");
        System.out.println(Arrays.toString(chart));

    }

}
