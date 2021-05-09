package hw13ab;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Fruits> fruit=new ArrayList<>();
        Fruits apple = new Fruits("Apple","Red");
        Fruits pear=new Fruits("Pear","Green");
        fruit.add(apple);
        fruit.add(pear);
        fruit.add(new Fruits("Peach","pink"));
        System.out.println(fruit.get(2).getName());


    }
}
