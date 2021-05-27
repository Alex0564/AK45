package hw9;

import java.lang.reflect.Type;
import java.sql.SQLOutput;

public class App1 {
    public App1() {
    }

    public static void main(String[] args) {
        Fish Koi = new Fish("Koi","Ogon","white and red");

        System.out.println(Koi.getName());

        Juice Tropicana = new Juice("Tropicana", "Type","size");

        System.out.println(Tropicana.getName());


        Laptop Sony = new Laptop("Sony","silver","software");

        System.out.println(Sony.getSoftware());


        Table plastic = new Table("kitchen","small","plastic");
        System.out.println(plastic.getMade());










    }



}

