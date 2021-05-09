package UmidaLesson14HW;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main (String[] args){
        System.out.println("------------1st HashMap <String, String>");
        Map<String, String> meal = new HashMap<>();
        //put
        meal.put("breakfast", "omlet");
        meal.put("branch", "cookies");
        meal.put("lunch", "sandwich");
        meal.put("dinner", "steak");
        meal.put("breakfast", "yogurt");
        System.out.println("Here is our meal course for today: "+meal);

        //replace
        meal.replace("branch", "hotdog");
        meal.replace("dinner", "soup");
        System.out.println("Kids would like for "+meal);

        //remove
        meal.remove("lunch");
        //forEach
        for(Map.Entry<String,String> entry: meal.entrySet()){
            System.out.println("for "+entry.getKey()+" is "+entry.getValue());
        }

        System.out.println("------------------------------------------");
        System.out.println("------------ 2nd HashMap <Integer, String>");
        Map<Integer, String> price = new HashMap<>();
        //put
        price.put(15, "rouge");
        price.put(28, "mascara");
        price.put(55, "foundation");
        price.put(21, "eyeShadow");
        System.out.println("Here's an updated restock of cosmetics: "+price);

        //replace
        price.replace(21, "eyePalette");
        price.replace(55, "bakingPowder");
        System.out.println("We do have price drop today: "+price);

        //remove
        price.remove(55);

        //forEach
        for(Map.Entry<Integer,String> entry: price.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("_______________________________________");
        System.out.println("------------3rd HashMap <Class1, Class2>");
        Map<Room,Furniture> roomDesign = new HashMap<>();
        Room bedroom = new Room("bedroom");
        Furniture bed = new Furniture("bed");

        Room kitchen = new Room("kitchen");
        Furniture cupboard = new Furniture("cupboard");

        Room bathroom = new Room("bathroom");
        Furniture sinkBoard = new Furniture("sinkboard");
        //put
        roomDesign.put(bedroom,bed);
        roomDesign.put(kitchen,cupboard);
        roomDesign.put(bathroom,sinkBoard);
        System.out.println(roomDesign.size());

        //forEach
        for(Map.Entry<Room,Furniture> entry : roomDesign.entrySet()){
            System.out.println(entry.getValue().getName()+" is in "+entry.getKey().getName());
        }

    }
}
