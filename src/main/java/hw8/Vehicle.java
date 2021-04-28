package hw8;

public class Vehicle {

    public String make;
    public String model;
    public String color;
    public int year;
    public int cost;

    public String getInfo() {
        return "\nyear = " + year + "\nmake = " + make + "\nmodel = " + model + "\ncolor = " + color + "\ncost = $" + cost;
    }
}
