package hw13daria;
import java.util.ArrayList;

public class App {
    public static void main (String []args){
        ArrayList<String> deserts = new ArrayList<>();
        ArrayList<String> moreDesserts =new ArrayList<String>();
        ArrayList<Integer> shoesSizes = new ArrayList<Integer>();

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




    }
}
