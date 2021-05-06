package hw13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        // Integer ArrayList

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(-12);
        numbers.add(25);
        numbers.add(8);
        System.out.println();
        System.out.println(numbers);
        System.out.println();
        System.out.println("Size of Integer's array list is " + numbers.size());
        System.out.println();
        numbers.add(1, 17);
        System.out.println(numbers);
        System.out.println();
        System.out.println("Number with index [3] is " + numbers.get(3));
        System.out.println();
        numbers.add(17);
        System.out.println(numbers);
        System.out.println();
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println("\n********************");

        //display each element of the using foreach loop

        System.out.println("\nUsing foreach loop:\n");

        for (int number :
                numbers) {
            System.out.print(number + " ");

        }
        System.out.println();
        System.out.println("\n*****************");


        //display each element of the array using for loop

        System.out.println("\nUsing for loop:\n");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("\n****************");

        //Sum the values

        int sum = 0;
        for (int v :
                numbers) {
            sum += v;
        }

        System.out.println("\nSum of values: " + sum);
    }
}
