package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");

        List<Integer> numbers = new ArrayList<Integer>();
        List<Person> people = new ArrayList<>();
        Person oleg = new Person("Oleg");
        people.add(oleg);
        people.add(new Person("Anna"));

        System.out.println(people.get(1).getName());
    }
}
