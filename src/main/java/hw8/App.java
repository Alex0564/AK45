package hw8;
//        1. Create 4 classes with fields and methods
//        2. In the App class create main() and create 2 instances of each class, fill all fields
//        invoke methods

public class App {

    public static void main(String[] args) {

        Person bob = new Person();
        bob.name = "Bob";
        bob.lastName = "Brown";
        bob.age = 50;

        Person kate = new Person();
        kate.name = "Kate";
        kate.lastName = "Davis";
        kate.age = 25;

        Computer mac = new Computer();
        mac.make = "Apple";
        mac.model = "MacBookPro";
        mac.oc = "macOS";
        mac.price = 1500;

        Computer dell = new Computer();
        dell.make = "Dell";
        dell.model = "Dell";
        dell.oc = "Windows";
        dell.price = 1000;

        Phone iphone = new Phone();
        iphone.make = "Apple";
        iphone.model = "iPhoneX";
        iphone.color = "Red";
        iphone.price = 1000;

        Phone samsung = new Phone();
        samsung.make = "Samsung";
        samsung.model = "Note";
        samsung.color = "Black";
        samsung.price = 900;

        Vehicle carOne = new Vehicle();
        carOne.type = "Sedan";
        carOne.make = "BMW";
        carOne.year = 2020;
        carOne.color = "Black";

        Vehicle carTwo = new Vehicle();
        carTwo.type = "SUV";
        carTwo.make = "Audi";
        carTwo.year = 2019;
        carTwo.color = "White";

        mac.sleepMode();
        kate.action1();
        iphone.call();
        carTwo.openTrunk();


    }
}
