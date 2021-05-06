package set;

import java.util.HashSet;
import java.util.Set;

public class App14a {
    public static void main(String[] args) {
        Set<String> appliances = new HashSet<>();
        appliances.add("Teapot");
        appliances.add("Microwave");
        appliances.add("Refrigerator");
        appliances.add("Stove");
        System.out.println(appliances);
        System.out.println(appliances.contains("Oven"));
        appliances.remove("Stove");
        System.out.println(appliances);
        for (String ap: appliances){
            System.out.println(ap);
        }
        Set<Fruit> food = new HashSet<>();
        Fruit apple = new Fruit("Apple");
        Fruit orange = new Fruit("Orange");
        Fruit pear = new Fruit("Pear");
        food.add(apple);
        food.add(orange);
        food.add(pear);
        food.add(new Fruit("Kiwi"));
        System.out.println(food);
        System.out.println(food.contains(pear));
        System.out.println(food.size());
        food.remove(orange);
        System.out.println(food);
        for (Fruit f: food){
            System.out.println(f);
        }

    }
}
