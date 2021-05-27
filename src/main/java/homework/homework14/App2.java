package homework.homework14;

import java.util.HashSet;
import java.util.Set;

public class App2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Orange");
        System.out.println("Size of fruit Set is "+fruits.size());
        System.out.println("Fruit Set contains "+fruits);
        System.out.println("--------------------------");

        Set<Berries> berries = new HashSet<>();
        Berries cranberry = new Berries("cranberry");
        Berries strawberry = new Berries("strawberry");
        Berries raspberry = new Berries("raspberry");
        Berries cherry = new Berries("cherry");
        berries.add(cranberry);
        berries.add(strawberry);
        berries.add(raspberry);
        berries.add(cherry);
        System.out.println("Size of berries Set is "+berries.size());
        for (Berries x: berries){
            System.out.println(x.getBerryName());
        }

    }
}
