package less16homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {




//      List of cattles:
        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 500);
        cattle.put(Cattle.PIGS, 200);
        cattle.put(Cattle.SHEEPS, 100);
        cattle.put(Cattle.CHICKENS, 1000);
        cattle.put(Cattle.TURKEYS, 100);

        System.out.println("Namber of "+Cattle.COWS + " === " + cattle.get(Cattle.COWS));

        System.out.println("Cattles: "+ cattle);

        for (Map.Entry<Cattle,Integer> entry: cattle.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());}
        System.out.println("=================");

//        List of agreeCulturales:
        List<AgreeCultural> agreeCulturals = new ArrayList<>();
        AgreeCultural soya = new AgreeCultural("Soya", 11);
        AgreeCultural wheat = new AgreeCultural("Wheat", 10);
        AgreeCultural pea = new AgreeCultural("Pea", 7);
        AgreeCultural rye = new AgreeCultural("Rye", 17);
        agreeCulturals.add(0,soya);
        agreeCulturals.add(1, wheat);
        agreeCulturals.add(2,rye);
        agreeCulturals.add(3, pea);

        System.out.println("Print agreecultures:"+ agreeCulturals);

        int ind = 2;
        System.out.println("agreeculture #"+ ind + " : " + agreeCulturals.get(ind));

        for (AgreeCultural agr: agreeCulturals) {System.out.println("arg = " + agr);}
        System.out.println("=================");

//        Farm:
        Address addressOfNewfarm = new Address("77500 1st Ave",
                "Cadiz", "OH", 43701);
        Address addressOffarm = new Address("77500 Jamison Ave",
                "Cadiz", "OH", 43907);
        Farm newfarm = new Farm("Land and Cattle", addressOfNewfarm, cattle, agreeCulturals);
        System.out.println(newfarm);

        newfarm.setName("Ohio Land and Cattle");
        newfarm.setAddress(addressOffarm);
        addressOffarm.setZip(50000);
        newfarm.printInfo();






    }
}
