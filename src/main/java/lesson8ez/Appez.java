package lesson8ez;

public class Appez {
    public static void main(String[] args) {
        Person david = new Person();

        david.name = "David";
        david.lastName = "Wilson";
        david.year = 1998;

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1999;

        System.out.println(david.lastName);

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

        Vehicle yourCar = new Vehicle();
        yourCar.beep();

        System.out.println(myFriendsCar.getInfo());

        anna.printInfo();
        david.printInfo();

    }
}
