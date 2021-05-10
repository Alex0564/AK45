package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
//        Map<String,String> capitals = new HashMap<>();
//        capitals.put("Washington","USA");
//        capitals.put("Berlin","Germany");
//        capitals.put("Tokyo","Japan");
//        System.out.println(capitals);
//        capitals.put("Tokyo","Narnia");
//        System.out.println(capitals);
//        capitals.put("Bonn","Germany");
//        System.out.println(capitals);
//
//        System.out.println(capitals.get("Bonn"));
//        System.out.println(capitals.get("Tokyo"));
//
//        capitals.replace("Tokyo","Japan");
//        System.out.println(capitals);


//        for (String key: capitals.keySet()){
//            System.out.println(key);
//        }
//        for (String value: capitals.values()){
//            System.out.println(value);
//        }
//        for (Map.Entry<String,String> entry: capitals.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

//        Map<Integer,String> colors = new HashMap<>();
//        colors.put(0,"Red");
//        colors.put(1,"Red");
//        colors.put(2,"Blue");
//        colors.put(3,"Green");
//
//        System.out.println(colors.get(1));

        Map<Pet,Person> petLife = new HashMap<>();
        petLife.put(new Pet(),new Person());

        System.out.println(petLife.size());



    }
}
