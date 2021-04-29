package hw9;
//        1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//        each field has getter and setter
//        2. In the App class create main() and create 2 instances of each class;
//        one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method
//        3. Create Enum, Create class. use Enum

public class App {

    public static void main(String[] args) {

        Person mike = new Person();
        mike.setName("Mike");
        mike.setLastName("Jones");
        mike.setAge(34);

        mike.printInfo();

        Person jane = new Person("Jane", "Hendricks", 55);

        jane.printInfo();

        Computer mac = new Computer();
        mac.setOc("macOS");
        mac.setMake("Apple");
        mac.setPrice(1500);
        mac.setModel("MacBookPro");

        mac.printInfo();

        Computer dell = new Computer("Dell", "Dell", "Windows", 1200);

        dell.printInfo();

        Phone iphone = new Phone();
        iphone.setColor("Black");
        iphone.setMake("Apple");
        iphone.setModel("iPhone 12");
        iphone.setPrice(1200);

        iphone.printInfo();

        Phone samsung = new Phone("Samsung", 1000, "White", "Galaxy");

        samsung.printInfo();

        Vehicle carOne = new Vehicle();
        carOne.setYear(2015);
        carOne.setType("SUV");
        carOne.setColor("Blue");
        carOne.setMake("Toyota");

        carOne.printInfo();

        Vehicle carTwo = new Vehicle("Sedan", "Mercedes", "Black", 2020);

        carTwo.printInfo();

        Fruit apple = new Fruit();
        apple.color = Colors.RED;
        apple.name = "Apple";

        apple.printInfo();

    }
}
