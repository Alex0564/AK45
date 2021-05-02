package Lesson8a;

public class App {
    public static void main(String[] args) {
        Person david = new Person();

        david.name = "David";
        david.LastName = "Wilson";
        david.year = 1998;

        Person anna = new Person();
        anna.name = "Anna";
        anna.LastName = "Wilson";
        anna.year = 1999;

        System.out.println(david.LastName);

        Vehicle myCar = new Vehicle();
        myCar.color = "Pink";
        myCar.make = "Toyota";
        myCar.model = "Prius";

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.model = "6";
        myFriendsCar.make = "Mazda";
        myFriendsCar.color = "Silver";
        myFriendsCar.year = 2007;

        System.out.println(myFriendsCar.year);
        myFriendsCar.year = 2008;
        System.out.println(myFriendsCar.year);

        Fruit apple = new Fruit();
        apple.name = "Apple";
        Fruit peach = new Fruit();
        peach.name = "Peach";

        System.out.println(apple.name);

        myCar.start();
        myFriendsCar.start();

        myCar.beep();
        myFriendsCar.beep();

        anna.printInfo();

    }
}