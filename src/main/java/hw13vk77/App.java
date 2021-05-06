package hw13vk77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Create 3 ArrayList - String, Integer and some Custom class
        //Add 4+ elements to each List
        //excersize methods add/set/remove/get/foreach and etc

        //1 Create 3 ArrayList - String, Integer and some Custom class
        //String
        ArrayList<String> myALs = new ArrayList<>();
        //Integer
        ArrayList<Integer> myALi = new ArrayList<>();
        //Custom class - Ball
        ArrayList<Ball> myAL = new ArrayList<>();
        Ball soccerball= new Ball("leather","silver","regular big","soccer");
        Ball basketball= new Ball("rubber","brown","big","basketball");
        Ball tennisball= new Ball("leather","yellow","regular small","tennis");
        Ball voleyball= new Ball("leather","white","regular big","volleyball");

        //2 Add 4+ elements to each List
        myALs.add("Hello");
        myALs.add(",");
        myALs.add("World");
        myALs.add("!");
        myALs.add("Java");

        System.out.println("===========================");
        System.out.println("Print Arraylist of Strings");
        for (String s:myALs){
            System.out.print(s);
        }
        System.out.println("\n");
        //set & foreach -excersize
        System.out.println("Print Arraylist after method set()");
        myALs.set(4,"Replaced word");
        for (String s:myALs){
            System.out.print(s);
        }
        System.out.println("\n");

        //remove & foreach
        System.out.println("Print Arraylist after method remove()");
        myALs.remove(4);
        System.out.println("item 4 removed");

        for (String s:myALs){
            System.out.print(s);
        }
        System.out.print("\n");
        //get & foreach
        //System.out.println(myALs.get(0));


        //
        myALi.add(5);
        myALi.add(5);
        myALi.add(2);
        myALi.add(0);
        myALi.add(2);
        myALi.add(0);
        System.out.println("===========================");
        System.out.println("Print Arraylist of Integers");
        for (int i:myALi) {
            System.out.println(i);
        }


        //
        myAL.add(soccerball);
        myAL.add(basketball);
        myAL.add(tennisball);
        myAL.add(voleyball);
        System.out.println("===========================");
        System.out.println("Print Arraylist of Custom class Ball");
        System.out.println("Arraylist of balls - 4 OBJECTS OF CUSTOM CLASS BALL");
        for (Ball ar:myAL) {
            System.out.println("type="+ar.getType()+", material="+ar.getMaterial()+", color="+ar.getColor()+", size="+ar.getSize());
        }










    }
}
