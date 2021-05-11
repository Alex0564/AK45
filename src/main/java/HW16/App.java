package HW16;

import HW15.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("429 Strasburg Rd", "Paradise", "PA", 17562);

        Map<Cattle,Integer> cattle=new HashMap<>();
        cattle.put(Cattle.CHICKENS, 1000);
        cattle.put(Cattle.COWS, 600);
        cattle.put(Cattle.PIGS,800);
        cattle.put(Cattle.SHEEPS, 700);
        cattle.put(Cattle.TURKEYS, 900);

        List<AgreeCultural> agreeCultural=new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Wheet", 6));
        agreeCultural.add(new AgreeCultural("Soya", 8));
        agreeCultural.add(new AgreeCultural("Pea", 7));

        Farm verdant = new Farm("VERDANT VIEW FARM", address, cattle, agreeCultural);

        verdant.getFarmInfo();
        }
    }

