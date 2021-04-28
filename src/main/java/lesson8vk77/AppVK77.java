package lesson8vk77;

public class AppVK77 {
    public static void main(String[] args) {
        Person david = new Person();

        david.name = "David";
        david.lastName = "Backham";
        david.year = 1998;

        Person anna = new Person();
        anna.name ="Anna";
        anna.lastName="Backham";
        anna.year =1999;

       // System.out.println(david.lastName);

        Vehicle mycar = new Vehicle();
        mycar.year=2018;
        mycar.make="Toyota";
        mycar.model="Camry";
        mycar.color="White";

        System.out.println(mycar.model +mycar.color+ mycar.make+ mycar.year );

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.model = "6";
        myFriendsCar.make ="Mazda";
        myFriendsCar.color = "Silver";
        myFriendsCar.year = 2007;
        System.out.println(myFriendsCar.year);
        myFriendsCar.year=2008;
        System.out.println(myFriendsCar.year);

        Fruit apple =new Fruit();
        apple.name = "Apple";
        Fruit peach = new Fruit();
        peach.name ="Peach";
        //System.out.println(apple.name + " & "+ peach.name);

        mycar.start();
        myFriendsCar.start();
        mycar.beep();
        myFriendsCar.beep();

        Vehicle yourcar = new Vehicle();
        yourcar.beep();
        System.out.println(mycar.getinfo());

        anna.printInfo();

    }

}
