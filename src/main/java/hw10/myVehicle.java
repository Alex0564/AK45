package hw10;

public class myVehicle extends Vehicles {

    private int mileage;

    public myVehicle(String make, String model, int year, exteriorColors exteriorColors, int mileage) {

        super(make, model, year, exteriorColors);
        this.mileage = mileage;

    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void printInfo() {

        System.out.println("My vehicle make is "+make+", model is "+model+" year is "+year+" with "+exteriorColors+" exterior color and "+mileage+" mileage");

    }

}
