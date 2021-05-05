package lesson13hw;


import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Vehicle> cars = new ArrayList<Vehicle>();
        Vehicle toyota = new Vehicle("Toyota");
        cars.add(toyota);
        cars.add(new Vehicle("Kia"));
        cars.add(new Vehicle("Ford"));
        cars.add(new Vehicle("Kia"));
        System.out.println(cars.get(2).getBrand());
     }
    }

