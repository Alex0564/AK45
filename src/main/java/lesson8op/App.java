package lesson8op;

import javax.sql.rowset.serial.SQLOutputImpl;

public class App {
    public static void main(String[] args) {
        Dog attila = new Dog();
        attila.name = "Attila";
        attila.breed = "German Shepherd";
        attila.gender = "Male";
        attila.year = 2010;
        System.out.println(attila.name);

        Dog merfy = new Dog();
        merfy.name = "Merfy";
        merfy.breed = "Beagle";
        merfy.gender = "Female";
        merfy.year = 2021;
        System.out.println(merfy.name);

//        System.out.println(attila.name+" "+"and"+" "+merfy.name+" like to play together");

        Groceries bread = new Groceries();
        bread.name = "Bread";
        bread.type = "Potato";
        bread.from = "Big Y";
        bread.NET = 3;

        Groceries cereal = new Groceries();
        cereal.name = "Cereal";
        cereal.type = "Cheerios";
        cereal.from = "Walmart";


//        System.out.println(bread.type+" "+bread.name+" "+bread.from);

        Person marry = new Person();
        marry.name = "Marry";
        marry.lastname = "Dove";
        marry.from = "Springfield";
        marry.year = 1962;

        Person john = new Person();
        john.name = "John";
        john.lastname = "Simpson";
        john.from = "Winsdor";
        john.year = 1955;

//        System.out.println(john.name+" "+"and"+" "+marry.name+" "+"are friends.");

        Vehicle car = new Vehicle();
        car.make = "Jeep";
        car.model = "Compass";
        car.color = "Red";
        car.year = 2020;

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.make = "Nissan";
        myFriendsCar.model = "Rouge";
        myFriendsCar.color = "Blue";
        myFriendsCar.year = 2019;

//        System.out.println(car.make+" "+car.model+" "+car.color);

        myFriendsCar.speed();
        cereal.halthy();


    }
}
