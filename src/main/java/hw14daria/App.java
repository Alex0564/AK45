package hw14daria;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main (String [] args){
        Map<String, String> plants = new HashMap<>();
        Map<Integer, String> days = new HashMap<>();
        Map<Books, Magazines> vogue = new HashMap<>();

        plants.put("Flower", "Roses");
        plants.put("Trees", "Cherry Tree");
        plants.put("Seaweed", "Laminaria");
        plants.put("Flowers", "Tulips");
//      System.out.println(plants.get("Flowers"));
//      System.out.println(plants.get("Trees"));
        plants.remove("Seaweed", "Laminaria");
        plants.put("Bushes", "Viburnum");
//      for (String v : plants.values()){ System.out.println(v); }
        plants.replace("Flower", "Roses", "Lilias");
//      for (String v : plants.values()){ System.out.println(v); }

        days.put(0, "Monday");
        days.put(1, "Tuesday");
        days.put(3, "Thursday");
        days.put (2, "Wednesday");
        days.put(4, "Fridayyay");
        days.remove(0, "Monday");
//      for (String p: days.values()){ System.out.println(p); }
        days.replace(1, "Sunday");
//      for (String p: days.values()){ System.out.println(p); }
//      System.out.println(days.get(4));

        Books b1 = new Books ("Master and Margarita");
        Books b2 = new Books ("Transerfing Realnosti");
        Magazines m1 = new Magazines("Bulgakhov");
        Magazines m2 = new Magazines("Zeland");

        for (Map.Entry<String, String> pairKeyValue: plants.entrySet()){
            System.out.println("The "+pairKeyValue.getKey()+" "+pairKeyValue.getValue());
        }
        for (Map.Entry<Integer, String> pairKeyValue:days.entrySet()){
            System.out.println(pairKeyValue.getKey()+" "+pairKeyValue.getValue());
        }




    }
}
