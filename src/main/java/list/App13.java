package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App13 {
    public static void main(String[] args) {
        List<String> car1 = new ArrayList<>();
        car1.add("Mazda");
        car1.add("Honda");
        car1.add("Hyundai");
        car1.add("Mercedes");
        System.out.println(car1);
        System.out.println(car1.size());

        car1.set(1, "BMW");
        System.out.println(car1);
        car1.remove("Mercedes");
        System.out.println(car1);
        System.out.println(car1.get(0));
        for (String cars: car1) {
            System.out.println(cars);
        }
//        for (int i=0; i<car1.size(); i++){
//            System.out.println(car1.get(i));
//        }

        List<Integer> houseNumber = new ArrayList<>();
        houseNumber.add(25);
        houseNumber.add(89);
        houseNumber.add(455);
        houseNumber.add(3);
        System.out.println(houseNumber);
        System.out.println(houseNumber.size());

        houseNumber.set(1, 55);
        System.out.println(houseNumber);
        houseNumber.remove(2);
        System.out.println(houseNumber);
        System.out.println(houseNumber.get(1));

        for (Integer houses: houseNumber){
            System.out.println(houses);
        }

//        for (int i=0; i<houseNumber.size(); i++){
//            System.out.println(houseNumber.get(i));
//        }

        List<Animal> cat = new ArrayList<>();
        Animal scottishFold = new Animal("Scottish Fold");
        cat.add(scottishFold);
        System.out.println(cat.get(0).getKind());
        cat.add(new Animal("Sphinx"));
        System.out.println(cat.get(1).getKind());
        cat.add(new Animal("Maine Coon"));
        cat.add(new Animal("Bengali"));
        System.out.println(cat.get(2).getKind());
        Animal siamese = new Animal("Siamese");
        cat.set(0,siamese);
        System.out.println(cat.get(0).getKind());
        cat.remove(siamese);
        System.out.println(cat.get(0).getKind());
        System.out.println(cat.toString());

        for (Animal cats : cat) {
            System.out.println(cats);
        }










    }
}
