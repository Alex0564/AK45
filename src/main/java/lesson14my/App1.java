package lesson14my;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        cities.put("New York","USA");
        cities.put("Kyiv", "Ukraine");
        cities.put("Lodz", "Poland");
        System.out.println(cities);
        cities.put("Kyiv", "ukraine");
        cities.put("Odessa", "Poland");
        System.out.println(cities);
        System.out.println(cities.get("Lod"));

        Map<Integer, Integer> code = new HashMap<>();
        code.put(2,5);
        code.put(34,575);
        code.put(32,11);
        System.out.println(code.get(34));

        Map<Integer,Boolean> gess = new HashMap<>();
        gess.put(23,true);
        gess.put(33, false);
        gess.put(1255,false);
        gess.put(034, true);

        for (String ke: cities.keySet()) {System.out.println(ke);}
        for (Integer i: code.values()) {System.out.println(i);}
        for (Map.Entry<Integer, Boolean>iter: gess.entrySet()) {
            System.out.println(iter.getKey()+" - "+iter.getValue());
        }

    }
}
