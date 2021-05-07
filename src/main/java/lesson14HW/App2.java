package lesson14HW;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        Map<Cars,Colors> vehicle = new HashMap<>();
        vehicle.put(new Cars(),new Colors());
        System.out.println(vehicle);  // Question ?

    }
}
