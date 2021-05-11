package hw13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<String>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Hamster");
        pets.add("Turtle");
        System.out.println(pets);
        pets.set(3,"Cat");
        System.out.println(pets);
        System.out.println(pets.get(1));
        pets.remove(2);
        System.out.println(pets);
        pets.add("Parrot");
        pets.set(2,"Hamster");
        System.out.println(pets);

        for (String pet: pets){
            System.out.println(pet);
        }

        List<Integer> temperature = new ArrayList<>();
        temperature.add(35);
        temperature.add(38);
        temperature.add(41);
        temperature.add(45);
        temperature.add(42);
        temperature.add(37);
        temperature.add(39);
        System.out.println(temperature);
        Integer oldValue = temperature.set(2,43);
        System.out.println(temperature);
        System.out.println(oldValue);
        System.out.println(temperature.get(3));
        temperature.remove(0);
        temperature.add(0,36);
        System.out.println(temperature);

        for (Integer temperatures: temperature){
            System.out.println(temperatures);
        }

        List<Staff> workers = new ArrayList<>();
        workers.add(new Staff("Chef",579.86,40));
        workers.add(new Staff("Kitchen Manager",487.59,40));
        workers.add(new Staff("Server",457.83,40));
        workers.add(new Staff("Hostess",478.36,40));
        System.out.println(workers.get(0).getName());
        workers.add(new Staff("Server",259.99,20));
        System.out.println(workers.get(2).getSalary());

        for (Staff worker: workers){
            System.out.println(worker.toString());
        }
        }

    }

