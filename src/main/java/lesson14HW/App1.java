package lesson14HW;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<Integer,String> fruits = new HashMap<>();
        fruits.put(0,"Apple");
        fruits.put(1,"Pear");
        fruits.put(2,"Kiwi");
        fruits.put(3,"Mango");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        fruits.replace(1,"Orange");
        System.out.println(fruits);

        fruits.remove(2);
        System.out.println(fruits);

        for (int key: fruits.keySet()) {
            System.out.println(key);
        }
        for (String value: fruits.values()){
            System.out.println(value);
        }
    }
}
