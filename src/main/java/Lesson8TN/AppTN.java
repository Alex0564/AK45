package Lesson8TN;

public class AppTN {
    public static void main(String[] args) {
        Person david = new Person();



        Vehicle myCar = new Vehicle();
        myCar.color = "Pink";
        myCar.make = "Toyota";
        myCar.model = "Prius";

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.model = "6";
        myFriendsCar.make = "Mazda";
        myFriendsCar.color ="Silver";
        myFriendsCar.year = 2007;

        System.out.println(myFriendsCar.year);
        myFriendsCar.year = 2008;
        System.out.println(myFriendsCar.year);

        Fruit apple = new Fruit();
        apple.name="Apple";
        Fruit peach= new Fruit();
        peach.name = "Peach";

        myCar.beep();

    }
}
