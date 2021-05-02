package Lesson9a;

public class App3 {

    public static void main(String[] args) {

        Bike myBike = new Bike("Fuji","Green",1);
        myBike.printInfo();

        Bike yourBike = new Bike();
        yourBike.setMake ("Kama");
        yourBike.setColor("Blue");
        yourBike.setSpeeds(12);

        yourBike.printClass();
        }
    }



