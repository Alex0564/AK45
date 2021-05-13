package hw12;

public class App {
    public static void main(String[] args) {

        /* Homework for Lesson 12 Interfaces, Polymorphism

        Create an interface and 2 classes which implements it
        Create 2 objects of each class
        Assign one object to interface type
         */

        Bedroom b1 = new Bedroom(16, 12, 8);
        System.out.println();
        b1.paint();
        b1.color();
        System.out.println("We need to buy " + b1.getSquareFootage() + " gallons of desired paint");
        System.out.println("And we also need to order " + b1.getFloorsArea() + " sq.f. of new hardwood");
        System.out.println("*****************************************************");

        PlayRoom p1 = new PlayRoom(20, 18, 8);
        p1.paint();
        p1.color();
        System.out.println(p1.getSquareFootage() + " gallons would be enough for painting this room!");
        System.out.println("Do not forget to buy " + p1.getFloorsArea() + " sq.f. of new carpet!");
        System.out.println("***********************************************");

        LivingRoom l1 = new LivingRoom(25.4, 25.4);
        l1.paint();
        l1.color();
        System.out.println("We need to buy " + l1.getSquareFootage() + " gallons of desired paint");
        System.out.println("And we also need to order " + l1.getFloorsArea() + " sq.f. of new hardwood");
        System.out.println("******************************************************");

        Bedroom l2 = new LivingRoom(15.5, 8);
        Room p2 = new PlayRoom(14.4, 10.8, 8);
        Room b2 = new Bedroom(22.4, 16.2, 8);
        Room l3 = new LivingRoom(22.5, 20.8);

        Room[] rooms = {b1, l1, b2, l2, p1, l3, p2};
        for (Room room : rooms) {
            room.paint();
        }
    }
}
