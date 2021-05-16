package homework16Farm;

import homework14.Student;
import homework14.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
       Address address = new Address("425 Lincoln rd", "Bend", "Oregon", 90342);

       Map<Cattle,Integer> cattle = new HashMap<>();
       cattle.put(Cattle.PIGS,40);
       cattle.put(Cattle.SHEEP, 140);
       cattle.put(Cattle.CHICKEN, 70);
       cattle.put(Cattle.COWS, 90);
       cattle.put(Cattle.GOATS, 70);
       cattle.put(Cattle.TURKEY, 45);

       AgreeCultural weet = new AgreeCultural("Weet", 1);
       AgreeCultural soya = new AgreeCultural("Soya", 2);
       AgreeCultural pea = new AgreeCultural("Pea", 3);
       AgreeCultural corn = new AgreeCultural("Corn",4);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(weet);
        agreeCultural.add(soya);
        agreeCultural.add(pea);
        agreeCultural.add(corn);

        Farm myFarm = new Farm("My Farm",address,cattle,agreeCultural);

        System.out.println(myFarm.printInfo());







    }
}
