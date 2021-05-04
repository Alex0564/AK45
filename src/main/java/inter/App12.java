package inter;

import inheritance.Parrot;

public class App12 {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Sweet", 1);
        apple1.eat();
        apple1.collect();
        System.out.println(apple1.cook());

        IFruit apple2 = new Apple("Sour", 1);
        apple2.eat();
        System.out.println(apple2.cook());
        apple2.collect();

        Apple apple3 = new Antonovka("Sour", 1);
        apple3.eat();
        System.out.println(apple3.cook());
        apple3.collect();

        Pear pear1 = new Pear("Yellow", 2);
        pear1.eat();
        System.out.println(pear1.cook());
        pear1.collect();

        IFruit pear2 = new Pear("Red", 2);
        pear2.eat();
        pear2.collect();
        System.out.println(pear2.cook());
    }
}
