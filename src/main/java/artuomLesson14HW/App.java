package artuomLesson14HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> item =new HashSet<>();
        item.add("Laptop");
        item.add("Mobilephone");
        item.add("ipad");
        item.add("Iphone");
        System.out.println(item);
        System.out.println(item.contains("PC"));
        item.add("Laptop");
        System.out.println(item);


        for(String x:item) {
            System.out.println(x);
        }

        Person devid=new Person("David","Timson",2000,20);
        Person ang=new Person("Angela","Shikova",2001,19);
        Person den=new Person("Den","Ackles",1995,26);
        Person arm=new Person("Armand","Hammer",1990,31);
        Person dan=new Person("Daniel","cavill",2004,17);

        System.out.println("=====================2=========================");



//        Set<String>Person=new HashSet<>();
//        Person.add(devid);
//        System.out.println(Person);






    }
}
