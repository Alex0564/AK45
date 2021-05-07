package lesson13HW;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(-2);
        numbers.add(11);
        System.out.println(numbers);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
         numbers.set(0,222);
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);

        for (Integer i: numbers){
            System.out.println(i);
        }

    }
}
