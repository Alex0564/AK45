package far;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App15 {
    public static void main(String[] args) {

        Address address1 = new Address("6400 W Red Bird Ln", "Dallas", "TX", 75236);

        Map<Cattle, Integer> cattle1 = new HashMap<>();
        cattle1.put(Cattle.COWS, 10);
        cattle1.put(Cattle.CHICKEN, 20);
        cattle1.put(Cattle.PIGS, 5);
        cattle1.put(Cattle.HORSES, 3);
        cattle1.put(Cattle.SHEEPS, 15);
        System.out.println(cattle1);

        AgreeCultural aC1 = new AgreeCultural("Wheat", 7);
        AgreeCultural aC2 = new AgreeCultural("Oats", 10);
        AgreeCultural aC3 = new AgreeCultural("Potato", 20);
        AgreeCultural aC4 = new AgreeCultural("Rye", 8);

        List<AgreeCultural> agreeCultural1 = new ArrayList<>();
        agreeCultural1.add(aC1);
        agreeCultural1.add(aC2);
        agreeCultural1.add(aC3);
        agreeCultural1.add(aC4);
        System.out.println(agreeCultural1);

        Farm farm1 = new Farm("Green Meadows Petting Farm", address1, cattle1, agreeCultural1);

        farm1.printInfo();



    }
}
