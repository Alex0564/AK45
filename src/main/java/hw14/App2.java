package hw14;


import java.util.HashSet;
import java.util.Set;
public class App2 {



    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");

        fruits.remove("Apple");
        System.out.println(fruits);

        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.contains("Apple"));

        for (String fr : fruits){
            System.out.println(fr);
        }

        Set<people> name = new HashSet<people>();
        name.add(new people("Bob")) ;
        name.add(new people("Nick"));
        name.add(new people("Mike"));
        name.add(new people("Helen"));
        System.out.println(name.size());
        System.out.println(name.contains("Mike"));
    }
}
