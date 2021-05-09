package homework14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

//        Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//                add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach

        Map<String, String> bestBeaches = new HashMap<>();
        bestBeaches.put("Navagio", "Greece");
        bestBeaches.put("Malibu", "USA");
        bestBeaches.put("Zuma", "USA");
        bestBeaches.put("Bondi", "Australia");
        bestBeaches.put("Nissi", "Fiji");
//        System.out.println(bestBeaches);
//        System.out.println(bestBeaches.get("Zuma"));
        bestBeaches.replace("Nissi", "Cyprus");

        for (String key : bestBeaches.keySet()) {
            System.out.println(key);
        }

//        ..........new HashMap...........

        Map<Integer, String> countries = new HashMap<>();
        countries.put(1, "China");
        countries.put(2, "India");
        countries.put(3, "USA");
        countries.put(4, "Indonesia");

        for (String value : countries.values()) {
            System.out.println(value);
        }

//          .......new HashMap.......

        Map<Student, Subject> major = new HashMap<>();

        Student kate = new Student("Kate");
        Student tamara = new Student("Tamara");
        Student jack = new Student("Jack");
        Student oleg = new Student("Oleg");

        Subject math = new Subject("Math");
        Subject history = new Subject("History");
        Subject chemistry = new Subject("Chemistry");
        Subject philosophy = new Subject("Philosophy");

        major.put(kate, math);
        major.put(tamara, history);
        major.put(jack, chemistry);
        major.put(oleg, philosophy);

//        for (Subject value : major.values()) {
//            System.out.println(value.toString(major.values()));
//        }
//        for (Student key : major.keySet()) {
//            System.out.println(key.toString(major.keySet()));
//        }
        String xx;
        for (Map.Entry<Student, Subject> entry:major.entrySet()){
            xx = entry.getKey().getName()+" - "
            +entry.getValue().getName();
            System.out.println(xx);

        }

//        Create 2 HashSet- <String>,  and custom classes <Class1>
//        add 4 elements to each hashset

        Set<String> beaches = new HashSet<>();
        beaches.add("Santa Monica");
        beaches.add("Malibu");
        beaches.add("Navagio");
        beaches.add("Bondi");
//        System.out.println(beaches);
        beaches.remove("Navagio");
        beaches.add("Ora");
        beaches.remove("Malibu");

        for (String beachesAll : beaches) {
            System.out.println(beachesAll);
        }

        System.out.println(beaches.contains("Ora"));
        System.out.println(beaches.contains("Zuma"));
        beaches.add("Zuma");
        System.out.println(beaches);

        Set<Student>students = new HashSet<>();
        students.add(kate);
        students.add(tamara);
        students.add(jack);
        students.add(oleg);

        for(Student name: students){
            System.out.println(name.getName());
        }


    }
}
