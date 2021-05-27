package homework.homework10;

public class Motorcycle extends Vehicle{
    private int numberOfWheels;

    public Motorcycle(Brand brand, FuelType[] fuelType, int numberOfWheels){
        super(brand,fuelType);
        this.numberOfWheels = numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Motorcycle() {
    }
}
