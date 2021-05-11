package Lesson8ObjOrProg;

import lesson8.Person;

public class App {
    public static void main(String[] args) {
       Personal david= new Personal();
       david.name="David";
       david.LastName="Wilson";
       david.year=1998;


        Person anna =new Person();
        anna.name="Anna";
        anna.lastName="Wilson";
        anna.year=1999;

//        System.out.println(david.LastName);

        Venicle myCar= new  Venicle();
        myCar.color="Pink";
        myCar.make="Tayota";
        myCar.model="LandCruiser";

        Venicle myFriendsCar=new Venicle();
        myFriendsCar.model="6";
        myFriendsCar.make="Mazda";
        myFriendsCar.color="Silver";
        myFriendsCar.year=2007;

//        System.out.println(myFriendsCar.year);
        myFriendsCar.year=2008;
//        System.out.println(myFriendsCar.year);


        Fruit apple= new Fruit();
        apple.name="Apple";

        Fruit peach= new Fruit();
        peach.name="Peach";


//        System.out.println(apple.name);

//         myCar.start();
//         myFriendsCar.start();

//         myCar.beep();
//         myFriendsCar.beep();

         Venicle youcar=new Venicle();
         //youcar.color="Green";
//         youcar.beep();

            anna.printInfo();
            david.printInfo();




    }
}
