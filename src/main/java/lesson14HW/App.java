package lesson14HW;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Paris", "France");
        capitals.put("Moscow","Russia");
        capitals.put("Madrid","Spain");
        capitals.put("Rome","Italy");
        System.out.println(capitals);

        System.out.println(capitals.get("Madrid"));

        capitals.replace("Madrid", "USA");
        System.out.println(capitals);

        capitals.remove("Paris");
        System.out.println(capitals);

        for (String key: capitals.keySet()){
            System.out.println(key);
        }
        for (String value: capitals.values()){
            System.out.println(value);
        }


    }
}
