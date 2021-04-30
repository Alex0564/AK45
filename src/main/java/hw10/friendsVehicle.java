package hw10;

public class friendsVehicle extends Vehicles {

    private interiorColors interiorColors;

    public friendsVehicle(String make, String model, int year, exteriorColors exteriorColors, interiorColors interiorColors) {

        super(make, model, year, exteriorColors);
        this.interiorColors = interiorColors;

    }

    public interiorColors getInteriorColors() {
        return interiorColors;
    }

    public void setInteriorColors(interiorColors interiorColors) {
        this.interiorColors = interiorColors;
    }

    public void printInfo() {

        System.out.println("My firend's vehicle make is "+make+", model is "+model+" year is "+year+" with "+exteriorColors+" exterior color and it has "+interiorColors+" interior color");
    }

}

