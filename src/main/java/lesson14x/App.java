package lesson14x;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Washington");
        cities.add("NYC");
        System.out.println(cities);

        cities.add("NYC");
        System.out.println(cities);

        System.out.println(cities.contains("NYC"));
        System.out.println(cities.contains("LA"));

        for (String x: cities){
            System.out.println(cities);
        }


        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Red");
        colors.put(2, "Blue");
        colors.put(3, "Green");
        System.out.println(colors.get(1));


        Map<Pet, Person> petLife = new HashMap<>();
        petLife.put(new Pet("Dog"), new Person("Shams"));
        System.out.println(petLife.size());


    }
}
