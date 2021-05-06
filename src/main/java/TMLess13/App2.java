package TMLess13;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> subColors = new ArrayList<>();
        subColors.add("Cyan");
        subColors.add("Magenta");
        colors.add("Red");
        System.out.println(colors);
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.get(2));
        colors.add("Blue");
        colors.add("Pink");
        System.out.println(colors);
        System.out.println(colors.size());
        colors.set(3,"Red");
        System.out.println(colors);
        colors.add("Green");
        colors.add(1,"Yellow");
        System.out.println(colors);

        colors.addAll(subColors);
        System.out.println(colors);
        System.out.println(colors.size());

        String oldValue = colors.set(0, "Brown");
        System.out.println(oldValue);
        System.out.println(colors);
        oldValue = colors.remove(1);
        System.out.println(oldValue);
        System.out.println(colors);
        colors.remove("Green");
        System.out.println(colors);

//        for (String color: colors){
//            System.out.println(color);
//        }
        for (int i=0; i<colors.size();i++){
            System.out.println(colors.get(i));
        }

    }
}
