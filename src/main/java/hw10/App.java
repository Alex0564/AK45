package hw10;
//        1. Create a super class and 3 child classes
//        create 2 object of each class (including superclass - don't make it abstract)
//        Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field

public class App {

    public static void main(String[] args) {

        myVehicle myvehicle = new myVehicle("BMW", "M5", 2019, exteriorColors.BLACK, 11000);

        myvehicle.printInfo();

        wifesVehicle wifesvehicle = new wifesVehicle("Audi", "A6", 2019, exteriorColors.BLACK, 5);

        wifesvehicle.printInfo();

        friendsVehicle friendsvehicle = new friendsVehicle("JEEP", "Compas", 2018, exteriorColors.SILVER, interiorColors.BEIGE);

        friendsvehicle.printInfo();

    }
}
