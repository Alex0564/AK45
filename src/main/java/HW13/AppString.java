package HW13;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;

public class AppString {
    public static void main(String[] args) {
        ArrayList<String> luxBrands = new ArrayList<>();
        luxBrands.add("Gucci");
        luxBrands.add("YSL");
        luxBrands.add("Louis Vuitton");
        luxBrands.add("Valentino");
        luxBrands.add("ZARA");
        luxBrands.add("Chanel");
        luxBrands.add("Michael Kors");
        luxBrands.set(4, "Dior");
        luxBrands.remove("Michael Kors");

        System.out.println(luxBrands);

        System.out.println(luxBrands.get(2));

        for (String brands : luxBrands){
            System.out.println(brands);
        }

        for (int i=0; i<luxBrands.size(); i++)
            System.out.println(luxBrands.get(i));

    }
}
