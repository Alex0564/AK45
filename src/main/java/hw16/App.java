package hw16;
//        Create a class Farm
//        fields
//        private String name;
//        private Address address; ()
//        private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
//        private List<AgreeCultural> agreeCultural; (AgreeCultural - class
//        private String nameOfCulture; Wheet, Soya, Pea
//        private int fielsNumber;
//
//        method printInfo() - print out all info

import java.util.*;

public class App {
    public static void main(String[] args) {

        AgreeCultural wheet = new AgreeCultural("Wheet", 20);
        AgreeCultural soya = new AgreeCultural("Soya", 10);
        AgreeCultural pea = new AgreeCultural("Pea", 17);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(wheet);
        agreeCultural.add(soya);
        agreeCultural.add(pea);

        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 50);
        cattle.put(Cattle.COWS, 20);
        cattle.put(Cattle.PIGS, 40);
        cattle.put(Cattle.SHEEPS, 18);

        Address address = new Address("d. Zyabkino", "Russia");

        Farm farm = new Farm("Kolhoz Lenina", address, cattle, agreeCultural);

        farm.printInfo();



//        farm.prCattle();
//        System.out.println(agreeCultural.toString());



    }
}
