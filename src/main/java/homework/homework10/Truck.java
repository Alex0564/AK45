package homework.homework10;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(Brand brand, FuelType[] fuelType, int loadCapacity){
        super(brand,fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Truck() {
    }
}
