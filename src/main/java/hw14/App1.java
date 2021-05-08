package hw14;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class App1 {
    public static void main(String[] args) {
        /*
        Homework for Lesson 14 Sets, Maps, Iterator
        * Create two Hashset - <String>, and custom class <Class1>;
        * Add four elements to each hashset;
        * Try methods add/remove/foreach
         */

        // <String> hashset

        Set<String> flowers = new HashSet<>();
        flowers.add("Supertunia");
        flowers.add("Hydrangea");
        flowers.add("Rose");
        flowers.add("Superbena");
        System.out.println();
        System.out.println(flowers);
        System.out.println("List size: " + flowers.size());
        flowers.add("Rose");  // element won't be added because already exists
        System.out.println(flowers);
        System.out.println("Does list contain Rose? The answer is: " + flowers.contains("Superbena"));
        System.out.println("Does list contain Camelia? The answer is: " + flowers.contains("Camelia"));
        flowers.remove("Supertunia");
        System.out.println(flowers);
        flowers.add("Tulip");
        System.out.println("******************************");

        System.out.println("Elements through foreach loop:");
        for (String flower :
                flowers) {
            System.out.println(flower);
        }

        System.out.println("********************");
        System.out.println("Iterating over list:");
        Iterator<String> i = flowers.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        // custom class hashset

        Individual john = new Individual("John", "Thomson", 34, "Lawyer");
        Individual sarah = new Individual("Sarah", "Wilson", 26, "QA Engineer");
        Individual angelina = new Individual("Angelina", "Simpson", 40, "Dentist");
        Individual david = new Individual("David", "Bauer", 24, "Electrician");

        System.out.println("*******************************");
        Set<Individual> individuals = new HashSet<Individual>();
        individuals.add(john);
        individuals.add(sarah);
        individuals.add(angelina);
        individuals.add(david);

        System.out.println("Size of custom class hashset: " + individuals.size());
        System.out.println("*******************************");

        System.out.println(individuals.contains(john));
        System.out.println(individuals.contains(angelina));
        System.out.println("****************************************");

        for (Individual v : individuals) {
            System.out.println(v.getName() + " " + v.getLastName() + " is " + v.getAge() + " years old "
                    + v.getProfession());
        }

        System.out.println("****************************************");

        individuals.remove(angelina);
        for (Individual v : individuals) {
            System.out.println(v.getName() + " " + v.getLastName() + " is " + v.getAge() + " years old "
                    + v.getProfession());
        }
    }
}
