package lesson14hw;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> beverages = new HashMap<>();
        beverages.put("Beer","Germany");
        beverages.put("Vodka", "Russia");
        beverages.put("Cognac","France");
        beverages.put("Champagne","France");
        System.out.println(beverages);

        beverages.replace("Beer","Germany","Belgium");
        System.out.println(beverages.get("Beer"));

        beverages.remove("Cognac");
        System.out.println(beverages);

        for (String key : beverages.keySet()){
            System.out.println(key);
        }

        for (String value : beverages.values()){
            System.out.println(value);
        }

        for (Map.Entry<String,String> entry : beverages.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        Map<String,Integer> ages = new HashMap<>();
        ages.put("Eldar",30);
        ages.put("Vika",32);
        ages.put("John",25);
        ages.put("Anna",40);
        ages.replace("Anna",40,41);
        ages.remove("Eldar");
        System.out.println(ages);
        ages.put("Eldar",30);
        System.out.println(ages.get("John"));

        for (String key : ages.keySet()){
            System.out.println(key);
        }

        for (Integer value : ages.values()){
            System.out.println(value);
        }

        for (Map.Entry<String,Integer> entry : ages.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map<Color,Jeans> pants = new HashMap<>();
        pants.put(new Color("Red"),new Jeans("Prada"));
        pants.put(new Color("Khaki"),new Jeans("Zara"));

        System.out.println(pants.size());
    }
}
