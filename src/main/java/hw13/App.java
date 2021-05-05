package hw13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Orange");
        Fruits.add("Banana");
        Fruits.add("Apple");
        Fruits.add("Kiwi");

        System.out.println(Fruits.size());
        Fruits.set(2,"Melon");
        System.out.println(Fruits);
        Fruits.remove(2);
        System.out.println(Fruits);
        Fruits.add(2,"Apple");
        System.out.println(Fruits);
        for (String fruit : Fruits){
            System.out.println(fruit);
        }


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(32);
        numbers.add(76);
        numbers.add(-45);
        numbers.add(0);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));



        List<Car> vehicle = new ArrayList<>();
        Car Ford = new Car();
        vehicle.add(Ford);
        Car Toyota = new Car();
        vehicle.add(Toyota);
        Car Subaru = new Car();
        vehicle.add(Subaru);
        Car Lada = new Car();
        vehicle.add(Lada);
        System.out.println(vehicle.size());




        }
    }
}
