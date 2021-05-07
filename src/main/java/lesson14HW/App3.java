package lesson14HW;

import java.util.HashSet;
import java.util.Set;

public class App3 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);

        colors.remove("Red");
        System.out.println(colors);

        for (String v:colors){
            System.out.println(v);
        }
//   couldn't do Get and replace

    }
}
