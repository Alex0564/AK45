package lesson14op;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Washington","USA");
        capitals.put("Berlin", "Germany");
        capitals.put("Tokyo", "Japan");
        System.out.println(capitals);
        capitals.put("Tokyo", "Narnia");
        System.out.println(capitals);
        capitals.put("Bonn", "Germany");
        System.out.println(capitals);

        System.out.println(capitals.get("Bonn"));
        System.out.println(capitals.get("Tokyo"));

        capitals.replace("Tokyo", "Japan");
        System.out.println(capitals);


        for (String key: capitals.keySet()){
            System.out.println(key);
        }
        for (String value: capitals.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry: capitals.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map<Pet, Person> petLife = new HashMap<>();
        petLife.put(new Pet(), new Person());

        System.out.println(petLife.size());


    }
}
