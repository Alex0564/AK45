package hw13ab;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Pear");
        fruits.add(1, "Banana");
        System.out.println(fruits.get(2));
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.remove(0);
        System.out.println(fruits);
        String OldValue = new String("Coconat");
        System.out.println(OldValue);

        ArrayList<Boolean> boo = new ArrayList<Boolean>();
        boo.add(true);
        boo.add(true);
        boo.add(false);
        System.out.println(boo);
        boo.remove(0);
        System.out.println(boo);


        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(5);
        nums.add(9);
        System.out.println(nums);
        System.out.println(nums.size());
        nums.add(1, 4);
        System.out.println(nums);


        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }
        for(int i=0; i>nums.size();i++){
            System.out.println(nums.get(i));
        }


    }

}