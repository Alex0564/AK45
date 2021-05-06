package hw14a;

import hw14.make;
import hw14.model;

import java.util.HashMap;
import java.util.Map;

public class App3 {
    public static void main(String[] args) {

        Map<make, model>Car = new HashMap<make,model>();
        Car.put(new make("Blue","1990"),new model("Full","1990"));
        System.out.println(Car);


        Map<weight, type>fruits = new HashMap<weight,type>();
        fruits.put(new weight("400 gr."),(new type("Orange")));
        fruits.put(new weight("500 gr."),(new type("Apple")));
        System.out.println(fruits);
        System.out.println(fruits.get("Orange"));


    }
}
