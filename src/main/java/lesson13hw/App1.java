package lesson13hw;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Integer> years = new ArrayList<Integer>();
        years.add(2000);
        years.add(2019);
        years.add(2020);
        years.add(2022);
        years.add(3,2021);
        System.out.println(years);
        Integer oldValue = years.set(0,2018);
        System.out.println(oldValue);
        System.out.println(years);
        System.out.println(years.get(3));

        for(int i = 0; i< years.size();i++){
            System.out.println(years.get(i));
        }
    }
}
