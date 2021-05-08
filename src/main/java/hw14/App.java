package hw14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Canada");
        countries.add("Kyrgyz Republic");
        countries.add("USA");
        countries.add("San Marino");

        System.out.println(countries);
        countries.remove("Canada");
        System.out.println(countries);
        System.out.println(countries.contains("USA"));
        System.out.println(countries.contains("Czechoslovakia"));

      //  methods put/replace/get are not available(


    }

}
