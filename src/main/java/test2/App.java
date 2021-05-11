package test2;

import lesson13.Person;

public class App {
    public static void main(String[] args) {

        Person p1 = new Person("Anna");
        Person p2 = p1;

        p1.setName("Vika");
//        System.out.println(p2.getName());

        String[]fruits=new String[5];
        fruits[0]="Banan";
        fruits[1]="Orange";
        fruits[2]="Kiwi";
        fruits[3]="Mango";
        fruits[4]="Strawbery";
//        fruits[5]="Blubery";
        System.out.println(fruits[0]);




    }
}
