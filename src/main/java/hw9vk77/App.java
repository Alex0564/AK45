package hw9vk77;

public class App {
    public static void main(String[] args) {
//        1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//        each field has getter and setter
//        2. In the App class create main() and create 2 instances of each class;
//        one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method

        ///Class #1 - Human
        System.out.println("=========================");
        System.out.println("print fields of class Human");
        //Full constr
        Human man = new Human("MALE", "John Doe", 65,185);
        Human woman = new Human("FEMALE", "Angelina Joly", 50,183);
        //default constr
        Human child = new Human();
        child.setName("Chloe");
        child.setAge(12);
        child.setSex("FEMALE");

        // invoke methods of every object - show values of every field

        man.printClass();
        woman.printClass();
        child.printClass();
        //////////////////////////////////////////////////////////////////////////

        ///Class #2 - Weapon
        //FULL CONSTR
        Weapon pistol =new Weapon("pistol", 8, 9.00, "Makarov");
        Weapon rifle =new Weapon("rifle", 30, 7.62, "AK47");
        //DEFAULT CONSTR
        Weapon autopistol = new Weapon();
        autopistol.setGuntype("Autopistolet");
        autopistol.setGunName("Pukalka");


        // invoke methods of every object - show values of every field
        System.out.println("=========================");
        System.out.println("print info");
        pistol.printInfo();
        rifle.printInfo();
        autopistol.printInfo();
        //////////////////////////////////////////////////////////////////////////


        ///Class #3 - Dog
        //FULL CONSTR
        Dog Sheppard = new Dog("Kolly sheppard",
                "white/black",
                "big",
                3,
                "custom sniffer",
                "Jassey",
                "loudly");
        Dog Chihuahua = new Dog("Chihuahua",
                "white/orange",
                "tiny",
                5,
                "social",
                "Pepper",
                "soft");

        //deault constr
        Dog Teryer =new Dog();
        Teryer.setKind("MiniTerryer");
        Teryer.setName("Maylo");


        //invoke methods for Dog class
        System.out.println("=========================");
        System.out.println("print fields of class Dog");
        Sheppard.printClass();
        Chihuahua.printClass();
        Teryer.printClass();

        ///////////////////////////////////////////////////////////

        ///Class #4 - Shoes
        //FULL CONSTR
        Shoes Sneakers = new Shoes("snickers","NIKE","Grey/Green",9.5,120.00,"Running" );
        Shoes Jordan = new Shoes("Jordan","REEBOK","White/Blue/Orange",10,250.00,"Basketball" );
        //Default const
        Shoes Kaloshi = new Shoes();
        Kaloshi.setShoeType("KALOSHI");
        Kaloshi.setShoeBrand("ADIBASS");

        System.out.println("=========================");
        System.out.println("print fields of class Shoes");
        Sneakers.printClass();
        Jordan.printClass();
        Kaloshi.printClass();



    }
}
