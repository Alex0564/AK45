package hw10;

public class wifesVehicle extends Vehicles {

    private int seatsNumber;

    public wifesVehicle(String make, String model, int year, exteriorColors exteriorColors, int seatsNumber) {

        super(make, model, year, exteriorColors);
        this.seatsNumber = seatsNumber;

    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public void printInfo() {

        System.out.println("My wife's vehicle make is "+make+", model is "+model+" year is "+year+" with "+exteriorColors+" exterior color and it has "+seatsNumber+" seats");

    }

}
