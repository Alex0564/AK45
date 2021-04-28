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

        System.out.println(attila.name+" "+"and"+" "+merfy.name+" like to play together");


    }
}
