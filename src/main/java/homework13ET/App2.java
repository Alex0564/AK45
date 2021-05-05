package homework13ET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> bonuses = new ArrayList<Integer>();
        bonuses.add(45000);
        bonuses.add(20000);
        bonuses.add(30500);
        bonuses.add(40000);
        System.out.println(bonuses);

        Integer oldValue = bonuses.set(2,22000);
        System.out.println(oldValue);
        bonuses.add(44500);

        System.out.println(bonuses.get(2));

        int minimum = Collections.min(bonuses);
        System.out.println(minimum);
        int maximum = Collections.max(bonuses);
        System.out.println(maximum);

        bonuses.add(37000);
        System.out.println(bonuses);






    }
}
