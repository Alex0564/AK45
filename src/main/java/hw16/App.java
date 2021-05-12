package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

    List<AgreeCulture> agreeCultures= new ArrayList<AgreeCulture>();
    agreeCultures.add(0,new AgreeCulture("Wheat",1));
    agreeCultures.add(1,new AgreeCulture("Soy",2));
    agreeCultures.add(2,new AgreeCulture("Pea",3));
    agreeCultures.add(3,new AgreeCulture("Potato",4));

//        System.out.println(agreeCultures);

        Map<Cattle,Integer> cattles1 = new HashMap<Cattle,Integer>();
        cattles1.put(Cattle.COWS,200);
        cattles1.put(Cattle.PIGS,300);
        cattles1.put(Cattle.CHICKENS,500);
        cattles1.put(Cattle.SHEEPS,100);

        Address myAddress = new Address("1212 Bedford Ave, Brooklyn NY 11235");

//        System.out.println(cattles1);

        Farm myFarm = new Farm("Brooklyn Farm",myAddress,cattles1,agreeCultures);
        System.out.println(myFarm.printInfoFarm());

    }
}
