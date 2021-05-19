package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Washington");
        cities.add("NYC");
        System.out.println(cities);
        cities.add("NYC");
        System.out.println(cities);
        System.out.println(cities.contains("LA"));

        for (String x:cities){
            System.out.println(x);
        }
    }
}
