package lesson14op;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {
       HashSet<String> cities = new HashSet<>();
       cities.add("Washington");
       cities.add("NYC");
        System.out.println(cities);
        cities.add("NYC");
        System.out.println(cities);
        System.out.println(cities.contains("NYC"));
        System.out.println(cities.contains("LA"));

        for (String x: cities){
            System.out.println(x);
        }
        Map<Integer,String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Red");
        colors.put(2, "Blue");
        colors.put(3, "green");

        System.out.println(colors.get(1));


    }
}
