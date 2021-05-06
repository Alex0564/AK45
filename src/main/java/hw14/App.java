package hw14;

//        Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//        add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach
//        Create 2 HashSet- <String>,  and custom classes <Class1>
//        add 4 elements to each hashset
//        try methods  put/replace/remove/get/foreach

import java.util.*;

public class App {

    public static void main(String[] args) {

        Map<String, String> str = new HashMap<>();
        Map<Integer, String> intStr = new HashMap<>();
        Map<Person, Vehicle> carSet = new HashMap<>();

        str.put("Apple", "Red");
        str.put("Peach", "Orange");
        str.put("Kiwi", "Green");
        str.put("Banana", "Yellow");

        System.out.println(str);
        str.replace("Banana", "Brown");
        System.out.println(str);
        str.remove("Peach", "Orange");
        System.out.println(str);

        for (String key: str.keySet()) {
            System.out.println(key);
        }

        for (String value: str.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> allIn: str.entrySet()) {
            System.out.println(allIn);
        }

        intStr.put(0, "Black");
        intStr.put(1, "White");
        intStr.put(2, "Green");
        intStr.put(3, "Red");

        intStr.remove(1);
        intStr.remove(2);
        intStr.replace(0, "Black", "White");

        for (Map.Entry<Integer, String> fullSet: intStr.entrySet()) {
            System.out.println(fullSet);
        }

        Person ann = new Person("Ann");
        Person pete = new Person("Pete");
        Person john = new Person("John");
        Person bob = new Person("Bob");

        Vehicle bmw = new Vehicle("BMW");
        Vehicle audi = new Vehicle("Audi");
        Vehicle mercedes = new Vehicle("Mercedes");
        Vehicle acura = new Vehicle("Acura");


        carSet.put(ann, acura);
        carSet.put(john, audi);
        carSet.put(bob, mercedes);
        carSet.put(pete, bmw);

        carSet.remove(bob);

        for (Vehicle value: carSet.values()) {
            System.out.println(value.toString(carSet.values()));
        }

        for (Person key: carSet.keySet()) {
            System.out.println(key.toString(carSet.keySet()));
        }

        Set<String> names = new HashSet<>();
        Set<Vehicle> vehicles = new HashSet<>();

        names.add("Michael");
        names.add("Ann");
        names.add("Bob");

        names.remove("Bob");

        for (String name: names) {
            System.out.println(name);
        }

        vehicles.add(bmw);
        vehicles.add(acura);
        vehicles.add(mercedes);
        vehicles.add(audi);

        vehicles.remove(acura);


        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getMake());
        }





    }
}
