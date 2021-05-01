package lesson8AB;

import java.sql.SQLOutput;

public class App {
    public static void main(String[]args){
        Person David = new Person();
        David.name = "David";
        David.lastName = "Wilson";
       David.year = 1998;


        Person Anna = new Person();
        Anna.name = "Anna";
        Anna.lastName = "Smith";
        Anna.year = 1999;

        //System.out.println(David.lastName);


        Vehicle myCar= new Vehicle();
        myCar.color= "Pink";
        myCar.make="Toyota";
        myCar.model="Prius";

        Vehicle myFriendCar = new Vehicle();
        myFriendCar.model="Mazda";
        myFriendCar.color="Green";
        myFriendCar.year= 2000;
        System.out.println(myFriendCar.year);
        myFriendCar.year=2008;
        //System.out.println(myFriendCar.year);


        Fruit apple=new Fruit();
        apple.name="Apple";
        Fruit peach=new Fruit();
        peach.name="Peach";
       // System.out.println(peach.name);


        //myCar.start();
       // myFriendCar.start();

       // myCar.beep();
       // myFriendCar.beep();

        Anna.printInfo();






    }

    }

