package Lesson9a;

public class App2 {
    public static void main(String[] args) {
        Car myCar = new Car("Mazda","6",1990);
        myCar.printInfo();

        Car yourCar = new Car();
        yourCar.setMake("Honda");
        yourCar.setModel("Accord");
        yourCar.setYear(1999);
        yourCar.printClass();
}
}
