package homework16x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw16 {
    public static void main(String[] args) {
//        Create a class Farm
//        fields
//        private String name;
//        private Address address; ()
//        private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
//        private List<AgreeCultural> agreeCultural; (AgreeCultural - class
//        private String nameOfCulture; Wheet, Soya, Pea
//        private int fieldNumber;
//
//        method printInfo() - print out all info

        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 50);
        cattle.put(Cattle.SHEEPS, 30);
        cattle.put(Cattle.PIGS, 25);
        cattle.put(Cattle.CHICKENS, 15);
        cattle.put(Cattle.TURKEYS, 20);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Wheet", 10));
        agreeCultural.add(new AgreeCultural("Soya",12));
        agreeCultural.add(new AgreeCultural("Pea", 15));

        Address address1 = new Address("64-31 108th St ");
        Farm newFarm = new Farm("Sunshine Farms", address1);

        newFarm.printInfo();

        System.out.println("\n"+"Cattle Info:"+"\n"+cattle);

        System.out.println("\n"+"Info about Agreeculturals and FieldsNumber");
        for (AgreeCultural values: agreeCultural){
            System.out.println(values);
        }

    }

}
