package homework10;

public class Car extends Vehicle{
    private int passengerSeats;

    public Car(Brand brand, FuelType[] fuelType, int passengerSeats){
        super(brand,fuelType);
        this.passengerSeats = passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public Car() {
    }
}
