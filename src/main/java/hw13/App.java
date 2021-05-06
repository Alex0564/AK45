package hw13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /* Homework for Lesson 13 Wrapper classes, Collections Java

        Create 3 ArrayList - String, Integer and some Custom class
        Add 4+ elements to each List
        Exercise methods add/set/remove/get/foreach and etc.

         */

        // String ArrayList
        List<String> subjects = new ArrayList<>();

        subjects.add("Math"); // add new element to the array list
        subjects.add("Science");
        subjects.add("English");
        subjects.add("Social Studies");
        subjects.add("English");
        System.out.println();
        System.out.println(subjects);
        System.out.println();
        subjects.set(0, "French"); // replace the element at the specified position in array list
        System.out.println(subjects);
        System.out.println();
        System.out.println("Size of elements is " + subjects.size()); // get size of the array list
        System.out.println();
        subjects.add("Literature"); // add new element to the end of the array list
        System.out.println(subjects);
        System.out.println();
        subjects.add(1, "World history"); // add new element to the specified position
        System.out.println(subjects);
        System.out.println();
        subjects.remove("English"); /* remove element (first element will be removed if there are
                                       several with the same name*/
        System.out.println(subjects);
        String oldValue = subjects.set(2, "Math"); /* replace element with new one
                                                    and save value of the old element */
        System.out.println();
        System.out.println("Old value of the element: " + "'" + oldValue + "'");
        System.out.println();
        System.out.println(subjects);
        System.out.println();
        subjects.remove(4); // remove element with certain index
        System.out.println(subjects);
        System.out.println("\n*********************************************************");

        //display each element of the using foreach loop

        System.out.println("\nUsing foreach loop:\n");

        for (String subject :
                subjects) {
            System.out.println(subject);

        }
        System.out.println("\n*****************************");

        //display each element of the array using for loop

        System.out.println("\nUsing for loop:\n");

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i));
        }
        System.out.println("\n*****************************");

        //display each element of the array using iterator

        Iterator<String> itr = subjects.iterator();
        System.out.println("\nUsing Iterator:\n");
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");

        }
        System.out.println("\n*****************************");

        //display each element of the array using ListIterator

        ListIterator<String> litr = subjects.listIterator();
        System.out.println("\nUsing ListIterator:\n");
        while (litr.hasNext()) {
            String element = litr.next();
//            litr.set(element + "+");
            System.out.println(element + " ");
        }
        System.out.println("\n*****************************");

        //display each element of the array backwards using ListIterator

        System.out.println("\nBackwards using ListIterator:\n");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();

    }
}
