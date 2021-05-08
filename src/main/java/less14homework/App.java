package less14homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {


    public static void main(String[] args) {
//        Map<String, String> shapes = new HashMap<>();
//        shapes.put("Circle", "Red");
//        shapes.put("Triangle", "Blue");
//        shapes.put("Square", "White");
//        shapes.put("Rectangle", "Brown");
//        System.out.println(shapes);
//        for (String kee: shapes.keySet()) {System.out.println(kee);}
//        shapes.replace("Circle", "Green");
//        shapes.remove("Triangle");
//        shapes.remove("Rectangle", "Brown");
//        System.out.println(shapes);
//        System.out.println(shapes.get("Square"));
//        System.out.println("============");
//        Map<Integer, String> size = new HashMap<>();
//        size.put(6,"S");
//        size.put(10,"M");
//        size.put(14,"L");
//        size.put(18,"XL");
//        System.out.println(size);
//        for (Integer s: size.keySet()) {System.out.println(s);}
//        size.replace(18, "XXL");
//        size.remove(14);
//        size.remove(10, "M");
//        System.out.println(size);
//        System.out.println(size.get(18));
        System.out.println("==============");
        Map<Surnames, Names> employee = new HashMap<>();
        employee.put(new Surnames("Cannon"), new Names("Bob"));
        Surnames alex = new Surnames("Gomes");
        Names mario = new Names("Mario");
        employee.put(new Surnames("Gomes"), new Names("Mario"));
        employee.put(new Surnames("Rivelli"), new Names("Ralph"));

        System.out.println("Number of employees are "+employee.size());

        System.out.println("\nPrint names with 'keySet':"+employee.keySet());

        System.out.println("\nPrint with employee: "+ employee);

        System.out.println("\nPrint with foreach: ");
        for (Surnames d: employee.keySet()) {System.out.println(d);}

        System.out.println("\nPrint with Iterator: ");
        Iterator<Surnames> sur = employee.keySet().iterator();
        while (sur.hasNext()){System.out.println(sur.next());}

    }
}
