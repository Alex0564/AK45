package lesson8x;

public class App {
    public static void main(String[] args) {

        Person david = new Person();

        david.name = "David";
        david.LastName = "Wilson";
        david.year = 1998;

        Person Anna = new Person();
        Anna.name = "Anna";
        Anna.LastName = "Wilson";
        Anna.year = 1999;

       // System.out.println(david.LastName);

        Vehicle myCar =new Vehicle();
        myCar.color="Pink";
        myCar.make="Toyota";
        myCar.model="Prius";

        Vehicle myFriendscar = new Vehicle();
        myFriendscar.model = "6";
        myFriendscar.make = "Mazda";
        myFriendscar.color = "Silver";
        myFriendscar.year = 2007;

        //System.out.println(myFriendscar.year);
        myFriendscar.year = 2008;
        //System.out.println(myFriendscar.year);

        Fruit apple = new Fruit();
        apple.name="Apple";

        Fruit peach = new Fruit();
        peach.name = "Peach";

        //System.out.println(apple.name);

        myCar.start();
        myFriendscar.start();

        myCar.beep();
        myFriendscar.beep();

        System.out.println(myCar.getInfo());

        david.printInfo();
        Anna.printInfo();

        david.printInfo();
    }
}
