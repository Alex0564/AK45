package homework.homework10;

public class Vehicle {
    protected Brand brand;
    protected FuelType[] fuelType;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setFuelType(FuelType[] fuelType) {
        this.fuelType = fuelType;
    }

    public Brand getBrand() {
        return brand;
    }

    public FuelType[] getFuelType() {
        return fuelType;
    }

    public Vehicle(Brand brand, FuelType[] fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public Vehicle() {}
}
