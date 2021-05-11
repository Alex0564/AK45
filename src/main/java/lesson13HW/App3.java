package lesson13HW;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static  void main(String[] args) {
        List<Car> vehicle = new ArrayList<>();
        Car toyota = new Car("Toyota");
        vehicle.add(toyota);
        vehicle.add(new Car("Mazda"));
        for (Car c: vehicle){
            System.out.println(c);
        }
        for (Car c: vehicle){
            System.out.println(c.getMake());
        }

        System.out.println(vehicle.get(1).getMake());

    }
}
