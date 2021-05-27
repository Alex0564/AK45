package lesson14op;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        List<String> fruets = new ArrayList<>();
        fruets.add("apple");
        fruets.add("peach");
        fruets.add("apple");
        fruets.add("mango");
        fruets.add("orange");

        Iterator<String> it = fruets.iterator();

        while (it.hasNext());
        System.out.println(it.next());


    }
}
