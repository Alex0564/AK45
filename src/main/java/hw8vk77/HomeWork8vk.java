package hw8vk77;

import java.sql.SQLOutput;

public class HomeWork8vk {
    public static void main(String[] args) {

        //1. Create 4 classes with fields and methods
        //2. In the App class create main() and create 2 instances of each class, fill all fields
        //invoke methods

        //Human class
        Human man = new Human();
        man.sex = "male";
        man.age = 35;
        man.eyecolor = "grey";
        man.name = "John Krassinsky";

        Human woman = new Human();
        woman.name ="Bonny";
        woman.age=29;
        woman.sex="female";
        woman.eyecolor ="green";

        //invoke methods
        man.run();
        woman.run();


        //Weapon class
        System.out.println("Suspects robbed bank and equipped with weapon");
        Weapon pistol = new Weapon();
        pistol.guntype ="pistol";
        pistol.gunName="Makarov";
        pistol.bulletsize =9.00;
        pistol.bulletamount =8;

        Weapon rifle = new Weapon();
        rifle.guntype ="rifle";
        rifle.gunName ="AK47";
        rifle.bulletamount =30;
        rifle.bulletsize =7.62;

        //invoke methods
        pistol.GetInfo();
        rifle.GetInfo();

        //Shoes class
        System.out.println("Today I went to the Sportshoes store");
        Shoes snikers = new Shoes();
        snikers.price=120.00;
        snikers.purpose="Running";
        snikers.shoeColor="Grey/green";
        snikers.shoeBrand="Nike";
        snikers.shoeType = "snickers";
        snikers.shoeSize = 9.5;
        Shoes jordan = new Shoes();
        jordan.price=250.00;
        jordan.purpose="Basketball";
        jordan.shoeColor="White/Blue/Orange";
        jordan.shoeBrand="Nike";
        jordan.shoeType = "Jordan";
        jordan.shoeSize = 10;

        System.out.println("So they shown me 2 most popular shoes of the month:");
        //invoke methods
        jordan.GetInfo();
        snikers.GetInfo();

        //Dog class
        System.out.println("My neighbors live with a dog!");
        Dog kolly = new Dog();
        kolly.color="white/black";
        kolly.kind="Kolly sheppard";
        kolly.size="big";
        kolly.name="Jassey";
        kolly.age=3;
        kolly.purpose="custom sniffer";
        kolly.howloudly="loudly";

        Dog chihua = new Dog();
        chihua.name="Pepper";
        chihua.color="white/orange";
        chihua.size="tiny";
        chihua.kind="Chihuahua";
        chihua.age = 5;
        chihua.purpose="social";
        chihua.howloudly="soft";

        //invoke
        chihua.bark();
        kolly.run();
        kolly.hide();
        kolly.bark();



    }

}
