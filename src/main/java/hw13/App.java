package hw13;
//        Create 3 ArrayList - String, Integer and some Custom class
//        Add 4+ elements to each List
//        excersize methods add/set/remove/get/foreach and etc

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Vehicles> vehicles = new ArrayList<>();

        names.add("Michael");
        names.add("John");
        names.add("Kate");
        names.add("Victor");
        names.add("Justin");

//        System.out.println(names);

        names.set(3, "Jack");
//        System.out.println(names);
        names.remove("Kate");
//        System.out.println(names);
        System.out.println(names.get(1));
        for (String name : names){
            System.out.println(name);
        }

        numbers.add(1);
        numbers.add(24);
        numbers.add(54);
        numbers.add(4);

//        System.out.println(numbers);
        Vehicles bmw = new Vehicles("BMW");
        Vehicles audi = new Vehicles("AUDI");
        vehicles.add(bmw);
        vehicles.add(audi);
        vehicles.add(new Vehicles("Mercedes"));
        System.out.println(vehicles.get(0).getName());
        System.out.println(vehicles.get(1).getName());
        vehicles.set(2, new Vehicles("Mazda"));
        System.out.println(vehicles.get(2).getName());



    }
}
