package lesson13HW;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pear");
        System.out.println(fruits);

        System.out.println(fruits.get(3));

        fruits.set(2, "Kiwi");
        System.out.println(fruits);

        System.out.println(fruits.size());

        fruits.remove(0);
        System.out.println(fruits);
        fruits.remove("Pear");
        System.out.println(fruits);

        for (String v: fruits){
            System.out.println(v);
        }
        for (int i = 0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }


    }
}
