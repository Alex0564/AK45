package hashmap;

import java.util.HashMap;

public class App14 {
    public static void main(String[] args) {
        HashMap<String, Integer> plants = new HashMap<>();
        plants.put("Chamomile", 2);
        plants.put("Rowan", 5);
        plants.put("Gooseberry", 2);
        plants.put("Violet", 3);
        System.out.println(plants);
        plants.replace("Rowan", 5, 6);
        System.out.println(plants);
        plants.remove("Chamomile", 2);
        System.out.println(plants);
        System.out.println(plants.get("Violet"));
        for (String key1: plants.keySet()){
            System.out.println(key1);
        }

    }
}
