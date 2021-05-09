package HW14;

import java.util.HashMap;
import java.util.Map;

public class AppMap {
    public AppMap() {
    }

    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("Arthur Cocan Doyle", "Sherlock Holmes");
        books.put("Alexandre Dumas", "The Count of Monte Cristo");
        books.put("Fyodor Dostoevsky", "Crime and Punishment");
        books.put("Ernest Hemingway", "The Old Man and the Sea");

            System.out.println(books.get("Alexandre Dumas"));

        for (String key: books.keySet()){
            System.out.println(key);
        }

        for (String value:books.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry:books.entrySet()){
            System.out.println(entry);
        }


        Map<Integer, String> food = new HashMap<>();
        food.put(1, "Pasta");
        food.put(2, "Pizza");
        food.put(3, "Hamburger");
        food.put(4, "Pelmeni");
        food.replace(4, "Khinkali");

        for (Map.Entry<Integer,String> v:food.entrySet()){
            System.out.println(v);
            System.out.println(food.get(1));
        }

        Map<Fruit, Color> fruit = new HashMap<>();
        fruit.put(new Fruit("Banana"), new Color("Yellow"));
        fruit.put(new Fruit("Apple"), new Color("Red"));
        fruit.put(new Fruit("Orange"), new Color("Orange"));
        fruit.put(new Fruit("Plum"), new Color("Blue"));


        System.out.println(fruit.size());

        }

        }
        





