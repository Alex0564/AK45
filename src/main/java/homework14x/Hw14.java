package homework14x;

import lesson14x.Person;
import lesson14x.Pet;

import java.io.OutputStream;
import java.util.*;

public class Hw14 {
    public static void main(String[] args) {
        // 1st HashMap
        Map<String, String> animals = new HashMap<>();

        // Method put
        animals.put("Dog", "Siberian Husky");
        animals.put("Horse", "Arabian Horse");
        animals.put("Cat", "Scottish Fold");
        animals.put("Bear", "White Bear");
        System.out.println(animals);

        // Method replace
        animals.replace("Bear", "Black Bear");
        System.out.println(animals);

        // Method remove
        animals.remove("Horse");
        System.out.println(animals);

        // Method get
        animals.get("Cat");
        System.out.println(animals);

        // Method foreach
        for (String key : animals.keySet()) {
            System.out.println(key);
        }

        for (String value : animals.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : animals.entrySet()) {
            System.out.println(entry);
        }


        // 2nd HashMap
        Map<Integer, String> numbers = new HashMap<>();

        // Method put
        numbers.put(0, "Zero");
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        System.out.println(numbers);

        // Method replace
        numbers.replace(0, "Null");
        System.out.println(numbers);

        // Method remove
        numbers.remove(3);
        System.out.println(numbers);

        // Method get
        numbers.get(2);
        System.out.println(numbers);

        // Method foreach
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }

        for (String value : numbers.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry);
        }

        // 3rd HashMap
        Map<Numbers, Planets> info = new HashMap<>();

        //Method put
        info.put(new Numbers(0), new Planets("Earth"));
        info.put(new Numbers(1), new Planets("Venera"));
        info.put(new Numbers(2), new Planets("Mercury"));
        info.put(new Numbers(3), new Planets("Mars"));

        System.out.println(info.size());


        // 1st HashSet
        Set<String> cars = new HashSet<>();

        // Method add
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Mazda");
        System.out.println(cars);

        // Method remove
        cars.remove("Audi");
        System.out.println(cars);

        //Method contains
        System.out.println(cars.contains("Mazda"));

        //Method foreach
        for (String names : cars) {
            System.out.println(cars);
        }


        // 2nd HashSet
        Set<Planets> name = new HashSet<>();

        name.add(new Planets("Earth"));
        name.add(new Planets("Venera"));
        name.add(new Planets("Mercury"));
        name.add(new Planets("Mars"));

        System.out.println(name.size());

    }
}
