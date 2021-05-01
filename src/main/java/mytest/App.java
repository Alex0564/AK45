package mytest;

public class App {

    public static void main(String[] args) {

        //object of super class Human
        Human h=new Human(25,1999);

        //object of child class Child
        Child ch=new Child(12,2015,"hello");
        /*
        HUMAN class
            private int age;
            protected int year;
        CHILD class
         (inherited from HUMAN both fields)
            private String s;
        inherited class Child have own pivate field: String s;
        but can access only through geter seter ot method
        so with object ch we can get direct access to filed  int year inherited from HUMAN class

        */

        //get value from filed private int age - only using geter
        System.out.println(h.getAge());

        // get direct value from field protected int year
        System.out.println(h.year);

        // get value from inheritted field private int age and own  field private String s;
        System.out.println(ch.getAge()+ch.getS());

        // get value from inheritted protected field int year and own filed private String s;
        System.out.println(ch.year+ch.getS());

        // get value from  field private String s in class CHILD using Method infoChild() in class CHILD
        ch.infoChild();

        // get value from field private int age in class HUMAN wich is inheritted to Child class and using Method infoChild() in class CHILD(inherited from class HUMAN)
        ch.infoMyHuman();

    }



}
