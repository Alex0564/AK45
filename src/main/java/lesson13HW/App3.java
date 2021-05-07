package lesson13HW;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static  void main(String[] args) {
        ArrayList<Car> vehicle = new ArrayList<>();
        Car toyota = new Car("Toyota");
        vehicle.add(toyota);
        vehicle.add(new Car("Mazda"));
        System.out.println(vehicle);  // Can't print ??????

        System.out.println(vehicle.get(1).getMake());

    }
}
