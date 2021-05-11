package artuomLesson14HW;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {

        Map<Integer,String>components=new HashMap<>();
        components.put(0,"SDD");
        components.put(1,"Processor");
        components.put(2,"Ram");
        components.put(3,"Mother Board");
        System.out.println(components);

        components.put(4,"Powerblock");
        components.put(5,"Mouse");
        components.put(0,"Screen");
        System.out.println(components);
        System.out.println(components.get(1));
        System.out.println(components.get(2));
        components.put(6,"Sdd");
        components.put(7,"Ram");
        System.out.println(components);
        System.out.println("=======================Print Value==================");
        System.out.println(components.get(0));
        System.out.println(components.get(1));
        System.out.println(components.get(2));
        System.out.println("=======================Replace==================");
        components.replace(0, "SDD");
        System.out.println(components);

        System.out.println("================1th type Iteration(Keys)=================");

        for (Integer key : components.keySet()) {
            System.out.println(key);
        }


        System.out.println("================2th type Iteration(Value)=================");


        for (String d: components.values())
            System.out.println(d);
        System.out.println("================3th type Iteration(KeyValue)=================");

        for(Map.Entry<Integer,String>item: components.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }

    }
}
