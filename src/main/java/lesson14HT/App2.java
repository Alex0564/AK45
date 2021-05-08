package lesson14HT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("peach");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
