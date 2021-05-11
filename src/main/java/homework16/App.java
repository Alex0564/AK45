package homework16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("246 Prospect St","Norwell","MA","02061");
        HashMap<Cattle,Integer> cattles = new HashMap<>();
        cattles.put(Cattle.CHICKENS,600);
        cattles.put(Cattle.COWS,230);
        cattles.put(Cattle.PIGS,300);
        cattles.put(Cattle.SHEEPS,150);
        cattles.put(Cattle.TURKEYS,400);
        List<AgreeCultural> agreeCulturals = new ArrayList<>();
        AgreeCultural wheet = new AgreeCultural("Wheet",10);
        AgreeCultural soya = new AgreeCultural("Soya",15);
        AgreeCultural pea = new AgreeCultural("Pea",7);
        agreeCulturals.add(wheet);
        agreeCulturals.add(soya);
        agreeCulturals.add(pea);

        Farm farm = new Farm("Hornstra Farms",address,cattles,agreeCulturals);
        farm.printInfo();
    }
}
