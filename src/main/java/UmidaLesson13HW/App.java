package UmidaLesson13HW;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("---------------1st ArrayList<String>"); //add, remove, set, get foreach
        ArrayList<String> flowers = new ArrayList<>();
        //add
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("daisy");
        flowers.add("iris");
        flowers.add("snowdrop");
        flowers.add("orchid");
        System.out.println(flowers);
        //remove
        flowers.remove(0);
        flowers.remove("daisy");
        System.out.println(flowers);
        //set
        flowers.set(2, "lotus");
        flowers.set(0, "lily");
        System.out.println(flowers);
        //get
        System.out.println(flowers.get(3));
        System.out.println(flowers.get(0));
        //forEach
        for (String i:flowers){
            System.out.println(i);
        }


        System.out.println("---------------2nd ArrayList<Integer>"); //add, remove, set, get foreach
        ArrayList<Integer> numbers = new ArrayList<>();
        //add
        numbers.add(0);
        numbers.add(56);
        numbers.add(877);
        numbers.add(1);
        numbers.add(15);
        numbers.add(28);
        System.out.println(numbers);
        //remove
        numbers.remove(2);
        numbers.remove(877);
        System.out.println(numbers);
        //set
        numbers.set(2, 877);
        numbers.set(0, 877);
        System.out.println(numbers);
        //get
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        //forEach
        for (Integer i : numbers){
            System.out.println(i);
        }

        System.out.println("---------------3rd ArrayList<Spice>"); //add, remove, set, get foreach
        List<String> spices = new ArrayList<>();
        Spice cardamon = new Spice("cardamon", "brown", "fruity");
        Spice cinnamon = new Spice("cinnamon", "brown", "sweet");
        Spice blackPepper = new Spice("blackPepper", "black", "hot");
        //add
        spices.add("ginger");
        spices.add("turmeric");
        spices.add("chilli");
        System.out.println(spices);
        //remove
        spices.remove("cardamon");
        System.out.println(spices);
        //set
        spices.set(0, "turmeric");
        System.out.println(spices);
        //get
        System.out.println(spices.get(1));
        //forEach
        for (String i:spices){
            System.out.println(i);
        }

    }
}
