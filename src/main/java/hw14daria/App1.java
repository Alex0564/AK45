package hw14daria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App1 {
    public static void main (String []args){
        Set<String> phones = new HashSet<>();
        Set<Dogs> doggies = new HashSet<>();

        phones.add("iPhone");
        phones.add("Galaxy S7");
        phones.add("Motorolla");
        phones.add("Nokia");
        System.out.println(phones);
        phones.remove("Galaxy S7");
        System.out.println(phones);
        for (String v:phones){ System.out.println(v);}
        System.out.println(phones.contains("Sony Erricson"));
        System.out.println(phones.contains("Nokia"));

       Dogs dogg = new Dogs("Pomeranian");
       Dogs dogg1 = new Dogs ("Spitz");
       doggies.add(dogg);
       doggies.add(dogg1);

       Iterator<Dogs>itr = doggies.iterator();
        while (itr.hasNext()) { System.out.println(itr.next()); }



    }

}
