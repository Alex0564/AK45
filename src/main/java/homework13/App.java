package homework13;


import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<String> soda = new ArrayList<String>();
        soda.add("Coca cola");
        System.out.println(soda);
        soda.add("Fanta");
        soda.add("Sprite");
        soda.add("Mountain dew");
        soda.add("Ginger ale");
        System.out.println(soda.get(4));
        System.out.println(soda);
        System.out.println(soda.size());
        soda.set(1, "Fanta");
        System.out.println(soda);
        soda.add("Ginger ale");
        soda.add(2, "Ginger ale");
        System.out.println(soda);
        soda.remove("Ginger ale");
        System.out.println(soda);

        for (String soda1 : soda) {
            System.out.println(soda);
        }
        ArrayList<String> chocolate = new ArrayList<String>();
        chocolate.add("Bounty");
        System.out.println(chocolate);
        chocolate.add("Picnic");
        chocolate.add("Riter Sport");
        chocolate.add("Snickers");
        Chocolate.add("Lind");
        System.out.println(chocolate.get(1));
        System.out.println(chocolate);
        System.out.println(chocolate.size());
        chocolate.set(2, "Riter Sport");
        System.out.println(chocolate);
        chocolate.add("Snickers");
        chocolate.add(3, "Lind");
        System.out.println(chocolate);
        chocolate.remove("Bounty");
        System.out.println(chocolate);

        for (String chocolate1 : chocolate) {
            System.out.println(chocolate);


        }

        ArrayList<String> iceCream = new ArrayList<String>();
        iceCream.add("Nestle");
        System.out.println(iceCream);
        iceCream.add("Ben&Jerry");
        iceCream.add("Haagen-Dazs");
        iceCream.add("Walls");
        iceCream.add("Breyers");
        System.out.println(iceCream.get(4));
        System.out.println(iceCream);
        System.out.println(iceCream.size());
        iceCream.set(3, "Haagen-Dazs");
        System.out.println(iceCream);
        iceCream.add("Nestle");
        iceCream.add(1, "Ben&Jerry");
        System.out.println(iceCream);
        iceCream.remove("Breyers");
        System.out.println(iceCream);

        for (String iceCream1 : iceCream) {
            System.out.println(iceCream);

        }
    }
}