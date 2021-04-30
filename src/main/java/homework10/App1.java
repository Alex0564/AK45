package homework10;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        FuelType[]toyotaFuel = {FuelType.GAS,FuelType.DIESEL};
        FuelType[]suzukiFuel = {FuelType.DIESEL};
        Truck truck1 = new Truck(Brand.SUZUKI,suzukiFuel,10000);
        Truck truck2 = new Truck(Brand.TOYOTA,toyotaFuel,12000);
        System.out.println("Truck 1 {Brand - "+truck1.getBrand()+", fuel type - "+ Arrays.toString(truck1.getFuelType()) +", load capacity - "+truck1.getLoadCapacity()+"lb}");
        System.out.println("Truck 2 {Brand - "+truck2.getBrand()+", fuel type - "+ Arrays.toString(truck2.getFuelType())+", load capacity - "+truck2.getLoadCapacity()+"lb}");

        FuelType[]audiFuel = {FuelType.GAS};
        FuelType[]bmwFuel = {FuelType.GAS};
        Car car1 = new Car(Brand.AUDI,audiFuel,4);
        Car car2 = new Car(Brand.BMW,bmwFuel,3);
        System.out.println("Car 1 {Brand - "+car1.getBrand()+", fuel type - "+ Arrays.toString(car1.getFuelType()) +", passenger seats - "+car1.getPassengerSeats()+"}");
        System.out.println("Car 2 {Brand - "+car2.getBrand()+", fuel type - "+ Arrays.toString(car2.getFuelType()) +", passenger seats - "+car2.getPassengerSeats()+"}");

        FuelType[]bmwMotoFuelFuel = {FuelType.GAS};
        FuelType[]suzukiMotoFuel = {FuelType.GAS};
        Motorcycle moto1 = new Motorcycle(Brand.BMW,bmwMotoFuelFuel,3);
        Motorcycle moto2 = new Motorcycle(Brand.SUZUKI,suzukiMotoFuel,2);
        System.out.println("Motorcycle 1 {Brand - "+moto1.getBrand()+", fuel type - "+ Arrays.toString(moto1.getFuelType()) +", number of wheels - "+moto1.getNumberOfWheels()+"}");
        System.out.println("Motorcycle 2 {Brand - "+moto2.getBrand()+", fuel type - "+ Arrays.toString(moto2.getFuelType()) +", number of wheels - "+moto2.getNumberOfWheels()+"}");

    }
}
