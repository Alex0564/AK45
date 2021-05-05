package hw13daria;
import hw10daria.kind;
import lesson13.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main (String []args){
        ArrayList<String> deserts = new ArrayList<>();
        ArrayList<String> moreDesserts =new ArrayList<String>();
        ArrayList<Integer> shoesSizes = new ArrayList<Integer>();
        List<Vegetables> veggies =new ArrayList<>();

        moreDesserts.add("Brownie");
        moreDesserts.add("Cupcake");
        deserts.add("Tiramisu");
        deserts.add("Ice-cream");
        System.out.println(deserts);
        System.out.println(deserts.get(0));
        deserts.add("Napoleon");
        deserts.addAll(moreDesserts);
        System.out.println(deserts);
        deserts.set(0, "Baklava");
        System.out.println(deserts);
        String oldValue= deserts.set(1, "Gelato");
        System.out.println(oldValue);
        System.out.println(deserts);
        System.out.println(deserts.get(4));
        deserts.add("Crepes");
        deserts.add("Pancakes");
        System.out.println(deserts.get(6));
        deserts.set(6, "Eclair");
        deserts.set(5, "Mochi");
        System.out.println(deserts);
        deserts.remove("Brownie");
        System.out.println(deserts);
        for (String desert: deserts){ System.out.println(desert); }

        shoesSizes.add(38);
        shoesSizes.add(39);
        shoesSizes.add(40);
        shoesSizes.add(41);
        for (int size: shoesSizes){System.out.println(size);}
        shoesSizes.remove(0);
        System.out.println(shoesSizes);
        shoesSizes.set(1, 36);
        System.out.println(shoesSizes);
        shoesSizes.add(35);
        shoesSizes.add(35);
        shoesSizes.add(37);
        System.out.println(shoesSizes);
        shoesSizes.set(0, 34);
        System.out.println(shoesSizes.get(4));

        veggies.add(new Vegetables("Tomato"));
        veggies.add(new Vegetables("Potato"));
        veggies.add( new Vegetables("Beet"));
        Vegetables eggplant = new Vegetables("Eggplant");
        Vegetables.add("Eggplant");
        System.out.println(veggies.get(1).getName());
        System.out.println(Arrays.toString(new List[]{veggies}));
        for (Vegetables v : veggies) { System.out.print(veggies);}

        // Tatyana, I was searching for the correct output for ArrayList but I found one
//        I can see extra braces.. Thank you!
    }
}
