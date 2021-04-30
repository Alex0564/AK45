package Homework8;

public class hw8 {
    public static void main(String []args){
        person maria = new person();
        maria.name = "Maria";
        maria.lastname = "Smith";
        maria.year = 2008;

        person antony = new person();
        antony.name = "Antony";
        antony.lastname = "Stukan";
        antony.year = 1979;

        System.out.println(maria.lastname);

        house myhouse = new house();
        myhouse.year = 1988;
        myhouse.size = 2000;
        myhouse.color = "Grey";

        house myparentshouse = new house();
        myparentshouse.year = 2000;
        myparentshouse.size = 2500;
        myparentshouse.color = "Yellow";

        System.out.println(myparentshouse.size);


        Flower rose = new Flower();
        rose.name = "Rose";
        Flower lilly = new Flower();
        lilly.name = "Lilly";
        Flower daisy = new Flower();
        daisy.name = "Daisy";

        System.out.println(lilly.name);
    }
}

