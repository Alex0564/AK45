package homework14op;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        Map<Integer,String> yearAndCity = new HashMap<>();
        yearAndCity.put(1980,"Moscow");
        yearAndCity.put(1984, "Los Angeles");
        yearAndCity.put(1988, "Seoul");
        yearAndCity.put(1992, "Barcelona");

        System.out.println(yearAndCity);
        for (Map.Entry<Integer,String> entry:yearAndCity.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(yearAndCity.get(1984));
    }
}
