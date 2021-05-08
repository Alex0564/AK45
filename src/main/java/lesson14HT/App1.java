package lesson14HT;

import jdk.jshell.PersistentSnippet;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        /*
        A map is an object that stores associations between keys and values.
        Both keys and values are objects. The keys must be unique, but the values my be duplicated.
        Iterator and for loop can not be used.
        The HashMap class extends AbstractMap and implements the Map interface.
        A hash map does not guarantee the order of its elements.
         */
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Washington", "USA");
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

        System.out.println("******************************************");
        for (String key : capitals.keySet()) {
            System.out.println(key);
        }
        System.out.println("**************************");
        for (String value : capitals.values()) {
            System.out.println(value);
        }
        System.out.println("***************************");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("********************************");

        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Red");
        colors.put(2, "Blue");
        colors.put(3, "Green");

        System.out.println(colors.get(1));

        Person david = new Person("David", 15);
        Person kevin = new Person("Kevin", 17);
        Person thomas = new Person("Thomas", 15);
        Pet pups = new Pet("Pups", 1);
        Pet pop = new Pet("Pop", 2);
        Pet mum = new Pet("Mum", 3);

        Map<Pet, Person> petLife = new HashMap<>();
        petLife.put(pups, david);
        petLife.put(pop, kevin);
        petLife.put(mum, thomas);

        System.out.println("***************************");
        for (Map.Entry<Pet, Person> entry : petLife.entrySet()) {
            System.out.println(entry.getKey().getNickname() + " " + entry.getKey().getAge() + " year, "
                    + entry.getValue().getName() + " " + entry.getValue().getAge() + " years");
        }
        petLife.replace(pups, kevin);
        petLife.replace(pop, david);

        System.out.println("***************************");
        for (Map.Entry<Pet, Person> entry : petLife.entrySet()) {
            System.out.println(entry.getKey().getNickname() + " " + entry.getKey().getAge() + " year, "
                    + entry.getValue().getName() + " " + entry.getValue().getAge() + " years");
        }
        System.out.println("***************************");
        System.out.println("Size is " + petLife.size());

        petLife.remove(mum);

        System.out.println("***************************");
        for (Map.Entry<Pet, Person> entry : petLife.entrySet()) {
            System.out.println(entry.getKey().getNickname() + " " + entry.getKey().getAge() + " year, "
                    + entry.getValue().getName() + " " + entry.getValue().getAge() + " years");
        }
    }
}
