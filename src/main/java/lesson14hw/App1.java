package lesson14hw;

import java.util.HashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Set<String> laptops = new HashSet<>();
        laptops.add("Macbook");
        laptops.add("Samsung");
        laptops.add("Dell");
        laptops.add("Asus");
        System.out.println(laptops);

        laptops.remove("Dell");
        System.out.println(laptops);
        System.out.println(laptops.contains("Asus"));

        for (String x : laptops){
            System.out.println(x);
        }
    }
}
