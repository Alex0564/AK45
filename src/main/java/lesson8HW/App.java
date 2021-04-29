package lesson8HW;

public class App {
    public static void main(String[] args) {

        Person will = new Person();
        will.name = "Will";
        will.lastName = "Smith";
        will.year = 2010;

        Person hana = new Person();
        hana.name = "Hana";
        hana.lastName = "Halio";
        hana.year = 2000;


        System.out.println(will.lastName);

        Vehicle myCar = new Vehicle();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.color = "Blue";
        myCar.year = 2015;

        System.out.println(myCar.make);

        will.printInfo();

        myCar.stop();

        }
    }

