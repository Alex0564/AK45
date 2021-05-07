package artuomLesson14HW;

import com.sun.jdi.request.ClassUnloadRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App3 {
   public static void main(String[] args) {


        Person devid=new Person("David","Timson",2000,20);
        Person ang=new Person("Angela","Shikova",2001,19);
        Person den=new Person("Den","Ackles",1995,26);
        Person arm=new Person("Armand","Hammer",1990,31);
        Person dan=new Person("Daniel","cavill",2004,17);

        System.out.println(den.getAge());


        Address tim=new Address("54","NYC",234,"10018");
        Address shik=new Address("Lexington","NYC",10005,"10000");
        Address ack=new Address("Neptun","Washington",100,"40005");
        Address ham=new Address("Day Ave","Miami",205,"33133");
        Address cav=new Address("W Trade Ave","Miami",256,"33313");



        Map<Address,Person> petLife = new HashMap<>();
        petLife.put((tim),(devid));
        petLife.put((shik),(ang));
        petLife.put((ack),(den));
        petLife.put((ham),(arm));
;

        System.out.println("=======================Print Value==================");


        String t;
        for(Map.Entry<Address,Person> entry: petLife.entrySet()) {
             t = "[" + entry.getKey().getStreet() + " " + entry.getKey().getCity() + " " + entry.getKey().getHouse()
                     + entry.getKey().getZipcode() + "] :" +" [" + entry.getValue().getName() + " " + entry.getValue().getLastname() + " "
                     + entry.getValue().getAge() + " " + entry.getValue().getYear() + "]";

             System.out.println(t);

             petLife.replace(tim, ang);
             petLife.put((shik),(ang));
             petLife.put((ack),(den));
             petLife.put((ham),(arm));
             String a;
//             for (Map.Entry<Address, Person> b : petLife.entrySet()) {
//                  a = "[" + entry.getKey().getStreet() + " " + entry.getKey().getCity() + " "
//                          + entry.getKey().getHouse() + entry.getKey().getZipcode() + "] :" + " " +
//                          "[" + entry.getValue().getName() + " " + entry.getValue().getLastname() + " "
//                          + entry.getValue().getAge() + " " + entry.getValue().getYear() + "]";
//
//                  System.out.println(a);
//             }
//             Если открыть строчки 53-60 Я не понимаю что происходит Подскажите пожалуйста

//     petLife.replace(tim,ang);


//       petLife.replace(ham,den)



//        Map<Pet,Person> petLife = new HashMap<>();
//        petLife.put(new Pet(),new Person());
//        System.out.println(petLife.size());

//        Set<Address>key=petLife.keySet();
//        System.out.println(petLife.get(1));


//       petLife.put(new Address((tim),new Person(ang));


        }
    }
}
