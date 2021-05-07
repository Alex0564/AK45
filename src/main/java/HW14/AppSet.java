package HW14;

import java.util.HashSet;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        Set<String> tvBrands = new HashSet<>();
        tvBrands.add("LG");
        tvBrands.add("Samsung");
        tvBrands.add("Sony");
        tvBrands.add("Siemens");
        tvBrands.remove("Siemens");
        tvBrands.add("Panasonic");

        System.out.println(tvBrands);

        for (String tv:tvBrands){
            System.out.println(tv);

            Set<FruitTN> fruits = new HashSet<>();
            fruits.add(new FruitTN("Apple"));
            fruits.add(new FruitTN("Peach"));
            fruits.add(new FruitTN("Pineapple"));
            fruits.add(new FruitTN("Peach"));

            System.out.println(fruits.size());



        }
    }
}
