package lesson8;

public class lesson8 {
    public static void main(String[] args) {
        persona david = new persona();
        david.name = "David";
        david.lastname = "Wilson";
        david.year = 1998;

        persona anna = new persona();
        anna.name = "Anna";
        anna.lastname = "Wilson";
        anna.year = 1999;

//        System.out.println(david.lastname);

        vehicle mycar = new vehicle();
        mycar .color ="Pink";
        mycar.make = "Tyota";
        mycar.model = "Prius";

        vehicle myFriendscar =new vehicle();
        myFriendscar.model ="6";
        myFriendscar.make ="Mazda";
        myFriendscar.color = "Silver";
        myFriendscar.year = 2007;

//        System.out.println(myFriendscar.year);

        myFriendscar.year = 2008;
//        System.out.println(myFriendscar.year);

        Fruit apple = new Fruit();
        apple.name = "Apple";
        Fruit peach = new Fruit();
        peach.name = "Peach";

//        System.out.println(apple.name);

        mycar.start();
        myFriendscar.start();

        mycar.beep();
        myFriendscar.beep();

        vehicle yourcar = new vehicle();
        yourcar.beep();





    }
}
