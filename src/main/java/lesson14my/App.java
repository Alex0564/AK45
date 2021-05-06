package lesson14my;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String > countries = new HashSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        System.out.println(countries);
        for (String i:countries) {System.out.println(i);}
//        System.out.println(countries.iterator().next());

    }

}
