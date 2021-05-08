package lesson14HT;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /*
        HashSet extends AbstractSet and implements the Set interface.
        Hashset doesn't contain indexes. Hashset does not guarantee the order.
        of its elements. If you need sorted storage, TreeSet is a better choice.
         */
        Set<String> cities = new HashSet<>();
        cities.add("Washington");
        cities.add("NYC");
        cities.add("Saint Louis");
        System.out.println(cities);
        cities.add("NYC"); //set contain only unique elements
        System.out.println(cities);
        //you can check if there is a unique element (response in 'false' or 'true)
        System.out.println(cities.contains("LA"));
        System.out.println(cities.contains("Saint Louis"));
        System.out.println(cities.size());
        cities.remove("NYC");
        System.out.println(cities);

        System.out.println("*************************");

        for (String x : cities) {
            System.out.println(x);
        }
        Set<Person> people = new HashSet<>();
        Person david = new Person ("David", 12);
        Person daniel = new Person("Daniel", 23);
        Person martha = new Person("Martha", 27);
        people.add(david);
        people.add(daniel);
        people.add(martha);
        System.out.println(people.contains(david));
        System.out.println(people.contains(daniel));
        System.out.println(people.contains(martha));
        System.out.println("*******************");

        for (Person v : people){
            System.out.println(v.getName() + "'s age is " + v.getAge());
        }
        System.out.println("*******************");

        people.remove(daniel);

        for (Person v : people){
            System.out.println(v.getName() + "'s age is " + v.getAge());
        }

    }
}
