package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        /* Homework extra
        Create a class Farm
        fields:
            -private String name;
            -private Address address; ()
            -private HashMap<Cattle,Integer> cattle;
                 (Cattle - enum - Cattle.COWS,Cattle.SHEEP, Cattle.PIGS,
                 Cattle.CHICKENS, Cattle.TURKEYS...
                 Value - Integer - number of animals of each kind)
            -private List<AgreeCultural> agreeCultural; (AgreeCultural - class
                                            private String nameOfCulture; Wheat, Soya, Pea
                                            private int fielsNumber;
        method printInfo() - print out all info */

        //Address

        Address address = new Address("1298 Township Road 875 N", "Lafayette Township", "IL", 61449);

        //Map

        Map<Cattle, Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.COWS, 50);
        cattle.put(Cattle.SHEEP, 124);
        cattle.put(Cattle.GOATS, 20);
        cattle.put(Cattle.CHICKENS, 225);
        cattle.put(Cattle.TURKEYS, 135);

        //List

        Agriculture wheat = new Agriculture("Wheat", 6);
        Agriculture soy = new Agriculture("Soy", 2);
        Agriculture pea = new Agriculture("Pea", 3);

        List<Agriculture> agriculture = new ArrayList<>();
        agriculture.add(wheat);
        agriculture.add(soy);
        agriculture.add(pea);

        //Farm

        Farm myFarm = new Farm("Don Main Farm", address, cattle, agriculture);


        System.out.println("There are following cattle in the farm:");
        for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {

            System.out.println(entry.getValue() + " " + entry.getKey());
        }

        System.out.println("****************");

        //print out all info

        System.out.println(myFarm.toString());
    }
}

