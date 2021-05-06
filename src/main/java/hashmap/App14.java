package hashmap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class App14 {
    public static void main(String[] args) {
        HashMap<Integer, String> plants = new HashMap<>();
        plants.put(4, "Chamomile");
        plants.put(5, "Rowan");
        plants.put(2, "Gooseberry");
        plants.put(3, "Violet");
        System.out.println(plants);
        plants.replace(5, "Rowan", "Strawberry");
        System.out.println(plants);
        plants.remove(4, "Chamomile");
        System.out.println(plants);
        System.out.println(plants.get(2));
        for (Integer key1: plants.keySet()){
            System.out.println(key1);
        }
        HashMap<String, String> buildings = new HashMap<>();
        buildings.put("House", "Wooden");
        buildings.put("Tanhouse", "Brick-built");
        buildings.put("Apartment", "Concrete");
        buildings.put("Cabin", "Panel");
        buildings.replace("Apartment", "Gypsum");
        System.out.println(buildings);
        buildings.remove("Apartment");
        System.out.println(buildings);
        System.out.println(buildings.get("Cabin"));
        for (String value1: buildings.values()){
            System.out.println(value1);
        }
        HashMap<Animal, Site> animal = new HashMap<>();
        animal.put(new Animal("cat"), new Site("Home"));
        Animal dog = new Animal("Dog");
        Site yard = new Site("Yard");
        animal.put(dog, yard);
        Site field = new Site("Field");
        Site see = new Site("See");
        Animal fox = new Animal("Fox");
        Site forest = new Site("Forest");
        animal.put(fox, forest);
        animal.put(new Animal("Fish"), new Site("Water"));
        animal.replace(fox, field);
        System.out.println(animal);
        animal.remove(fox);
        System.out.println(animal);
        System.out.println(animal.get(dog));
        for(Map.Entry<Animal, Site> entry: animal.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
