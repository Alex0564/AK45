package UmidaLesson14HW;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        System.out.println("=================HashSet<String>");
        Set<String> flowers = new HashSet<>();
        //add
        flowers.add("tulip");
        flowers.add("rose");
        flowers.add("iris");
        flowers.add("orchid");
        flowers.add("chamomile");
        flowers.add("magnolia");
        System.out.println("We offer a big variety of flowers in our store: " + flowers);
        System.out.println("There are " + flowers.size() + " kind of flowers");

        //remove
        flowers.remove("tulip");

        //for
        for(String flora : flowers){
            System.out.println(flora);
        }

        System.out.println("==========================");
        System.out.println("==============HashSet<Class>");
        HairStyle ponytail = new HairStyle("ponytail");
        HairStyle dragon = new HairStyle("dragon");
        HairStyle pigtails = new HairStyle("pigtails");
        HairStyle bunch = new HairStyle("bunch");

        Set<HairStyle> styles = new HashSet<>();

        //add
        styles.add(ponytail);
        styles.add(pigtails);
        styles.add(bunch);
        styles.add(dragon);
        System.out.println("What hair style would you like: "+styles+"?");

        //remove
        styles.remove(bunch);

        //for
        for(HairStyle hs : styles){
            System.out.println(hs.getName());
        }


    }
}
