package test2;

import lesson13.Person;

public class App {
    public static void main(String[] args) {

        Person p1 = new Person("Anna");
        Person p2 = p1;

        p1.setName("Vika");
        System.out.println(p2.getName());

    }
}
