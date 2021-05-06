package hw14vk77;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        /*
    Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
    add 4 elements to each hashmap
try methods  put/replace/remove/get/foreach

    Create 2 HashSet- <String>,  and custom classes <Class1>
    add 4 elements to each hashset
try methods  put/replace/remove/get/foreach
*/
        //Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
        //    add 4 elements to each hashmap

        //Create custom classes Person and Pet
        Person jacob =new Person("Jacob","Phoenix","Denver",45);
        Pet cat =new Pet("Chloe","cat",3,"female");

        Person ivan = new Person("Ivan","Petrov","Moscow",32);
        Pet dog = new Pet("Bobik","dog",5,"male");

        Person martha= new Person("Martha","Collins","New York",21);
        Pet racoon =new Pet("Gorra","racoon", 2,"female");

        Person jack = new Person("Jack","London", "San Fransisco",145);
        Pet wolf = new Pet("White Fang","wolf",115,"male");
        Person me =new Person("fake","fake","fake",0);
        Pet bear = new Pet("TaddyBear","bear",10,"male");
        //create 3 HashMap
        Map<String,String> schedule=new HashMap<>();
        Map<Integer,String> tempschedule=new HashMap<>();
        Map<Person,Pet> humanandpet=new HashMap<>();

        //1 fill out schedule  with elements (using method put())
        schedule.put("Monday","8:30 pm");
        schedule.put("Tuesday","8:30 pm");
        schedule.put("Wednesday","8:30 pm");
        schedule.put("Thursday","8:30 pm");
        schedule.put("Friday","8:30 pm");
        schedule.put("Saturday","12:00 am");
        //2 fill out tempschedule  with elements (using method put())
        tempschedule.put(1,"8:30 pm");
        tempschedule.put(2,"10:00 pm");
        tempschedule.put(3,"8:30 pm");
        tempschedule.put(4,"10:00 pm");
        tempschedule.put(5,"8:30 pm");
        tempschedule.put(6,"12:00 pm");
        //3 fill out humanandpet with elements (using method put())
        humanandpet.put(jacob,cat);
        humanandpet.put(ivan,dog);
        humanandpet.put(martha,racoon);
        humanandpet.put(jack,wolf);
        humanandpet.put(me,wolf);

        System.out.println("Task 1========================================================");
        System.out.println("LEts see all HashMap keys and values");
        System.out.println("=========================================================");
        for(Map.Entry<String,String> entry: schedule.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for(Map.Entry<Integer,String> entry: tempschedule.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        String mystring;
        for(Map.Entry<Person,Pet> entry: humanandpet.entrySet()){
            mystring="["+entry.getKey().getName()+" "+entry.getKey().getName()+" from "+entry.getKey().getCity()+"] : ["+entry.getValue().getPettype()+" "+entry.getValue().getPetnickname()+"]";
            System.out.println(mystring);
        }



        //replace/remove/get/foreach
        schedule.replace("Tuesday","10:00 pm");
        schedule.replace("Thursday","10:00 pm");
        schedule.remove("Saturday");
        tempschedule.replace(2,"8:30 pm");
        tempschedule.replace(4,"8:30 pm");
        tempschedule.remove(6);
        humanandpet.replace(jacob,racoon);
        humanandpet.replace(martha,cat);
        humanandpet.remove(me);

        System.out.println("=========================================================");
        System.out.println("HashMap keys and values after replace and remove");
        System.out.println("=========================================================");
        for(Map.Entry<String,String> entry: schedule.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for(Map.Entry<Integer,String> entry: tempschedule.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         mystring="";
        for(Map.Entry<Person,Pet> entry: humanandpet.entrySet()){
            mystring="["+entry.getKey().getName()+" "+entry.getKey().getName()+" from "+entry.getKey().getCity()+"] : ["+entry.getValue().getPettype()+" "+entry.getValue().getPetnickname()+"]";
            System.out.println(mystring);
        }

        //Create 2 HashSet- <String>,  and custom classes <Class1>
        //    add 4 elements to each hashset
        //try methods  put/replace/remove/get/foreach
        Set<String> animals = new HashSet<>();
        Set<Pet> pets = new HashSet<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("racoon");
        animals.add("wolf");
        animals.add("bear");

        pets.add(cat);
        pets.add(dog);
        pets.add(racoon);
        pets.add(wolf);
        pets.add(bear);
        System.out.println("************************************************************************************");
        System.out.println("Task 2=========================================================");
        System.out.println("HashSet values (used method add() and contains)");
        System.out.println("=========================================================");
        System.out.println("HashSet animals==================================================");
        System.out.println(animals);
        System.out.println(animals.contains("racoon"));
        for (String v:animals){
            System.out.println(v);
        }
        System.out.println("HashSet pets=====================================================");
        for (Pet v:pets){
            System.out.println(v.getPettype()+" "+v.getPetnickname());
        }


        System.out.println("HashSets animals after remove()==================================================");
        animals.remove("bear");


        for (String v:animals){
            System.out.println(v);
        }

        System.out.println("HashSets pets after remove()==================================================");
        pets.remove(bear);
        for (Pet h:pets){
            System.out.println(h.getPettype()+" "+h.getPetnickname());
        }

    }

}
