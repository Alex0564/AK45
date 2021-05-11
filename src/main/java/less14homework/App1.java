package less14homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
//        List<String> furniture = new ArrayList<>();
//        furniture.add("Table");
//        furniture.add("Chair");
//        furniture.add("Closet");
//        furniture.add("Bed");
//        System.out.println(furniture);
//        furniture.remove("Table");
//        System.out.println(furniture.get(1));
//        System.out.println(furniture.get(0));
//        furniture.add("Sofa");
//        for (String f1: furniture) {System.out.println(f1);}
        System.out.println("=============");
        List<Names> cityJob = new ArrayList<>();
        cityJob.add(new Names("Freddy"));
        cityJob.add(new Names("Stephen"));
        cityJob.add(new Names("Joseph"));
        cityJob.add(new Names("John"));
        Names dexter = new Names("Dexter");
        cityJob.add(dexter);
        System.out.println(cityJob.get(1));
        System.out.println(cityJob.get(0));

        System.out.println("\nThere ara "+cityJob.size()+" employees");
        System.out.println("Print names with 'toString':");
        for (Names n: cityJob) {System.out.println(n.toString());}

        cityJob.remove(dexter);
        System.out.println("\nThere ara "+cityJob.size()+" employees after removing");

        System.out.println("\nPrint names with 'Iterator':");
        Iterator<Names> it = cityJob.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("\n Print names with 'getName':");
        for (Names na: cityJob) {System.out.println(na.getName());}
    }
}
