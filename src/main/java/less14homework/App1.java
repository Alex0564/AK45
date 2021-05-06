package less14homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> furniture = new ArrayList<>();
        furniture.add("Table");
        furniture.add("Chair");
        furniture.add("Closet");
        furniture.add("Bed");
        System.out.println(furniture);
        furniture.remove("Table");
//        System.out.println(furniture.get(1));
//        System.out.println(furniture.get(0));
        furniture.add("Sofa");
        for (String f1: furniture) {System.out.println(f1);}
        System.out.println("=============");
        List<Names> cityJob = new ArrayList<>();
        cityJob.add(new Names("Freddy"));
        cityJob.add(new Names("Stephen"));
        cityJob.add(new Names("Joseph"));
        cityJob.add(new Names("John"));
        cityJob.remove("Freddy");
        for (Names na: cityJob) {System.out.println(na);}
        Iterator<Names> it = cityJob.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
