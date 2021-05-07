package HWTM84_Less14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> processors = new HashMap<>();
        processors.put("Intell", "Celeron");
        processors.put("Intell", "Core i5");
        processors.put("Intell", "Core i7");
        processors.put("AMD", "Ryzen 7");
        processors.put("AMD", "Ryzen 9");
        processors.remove("Intell");
        System.out.println(processors);

        Map<Integer, String> ccc = new HashMap<>();
        ccc.put(00, "Celeron");
        ccc.put(01, "Core i5");
        ccc.put(02, "Core i7");
        ccc.put(03, "Ryzen 7");
        ccc.put(04, "Ryzen 9");
        System.out.println(ccc);

        Map<Drivers, Trucks> worker = new HashMap<>();

    }
}
