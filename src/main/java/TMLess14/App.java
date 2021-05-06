package TMLess14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Washington");
        cities.add("NYC");
        System.out.println(cities);
        System.out.println(cities.contains("LA"));
        System.out.println(cities.contains("NYC"));
    }
}
