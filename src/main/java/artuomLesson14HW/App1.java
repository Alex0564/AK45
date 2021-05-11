package artuomLesson14HW;

import ArtuomLesson13HW.Person;
import ArtuomLesson8HW.Laptop;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {

        System.out.println("==================Add Elements=============");

        Map<String, String> things = new HashMap<>();
        things.put("Laptop", "Desk");
        things.put("Table", "LivingRoom");
        things.put("Shelves", "Kitchen");
        things.put("House", "Street");
        things.put("Pillow", "Sofa");
        System.out.println(things);
        things.put("Shelves", "Wardrobe");
        System.out.println(things);
        things.put("Carpet", "LivingRoom");
        System.out.println(things);
        System.out.println("=======================Print Value==================");
        System.out.println(things.get("Pillow"));
        System.out.println(things.get("Laptop"));
        System.out.println(things.get("Shelves"));
        System.out.println("=======================Replace==================");
        things.replace("Shelves", "Kitchen");
        System.out.println(things);
        System.out.println("============================Add (key,Value====================");
        things.put("Bike", "Street");
        System.out.println(things);

        System.out.println("================1th type Iteration(Keys)=================");

        for (String key : things.keySet()) {
            System.out.println(key);
        }


        System.out.println("================2th type Iteration(Value)=================");


        for (String value : things.values())
            System.out.println(value);
        System.out.println("================3th type Iteration(KeyValue)=================");

        for(Map.Entry<String,String>item: things.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
