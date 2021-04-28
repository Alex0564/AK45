package lesson8x;

public class Vehicle {
    public int year;
    public String make;
    public String model;
    public String color;

    public void start() {
        System.out.println(make + " " + model + " started engine");
    }

    public void beep() {
        System.out.println(color + " car made beep");
    }

    public String getInfo() {
        return "year = " + year + " make = " + make + " model = " + model + " color = " + color;

    }
}
