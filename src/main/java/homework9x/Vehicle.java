package homework9x;

public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;


    public Vehicle(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Vehicle() {
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }


    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }


    public void printInfo() {
        System.out.println("Info about Car:" + "\nMake: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year);
    }

}
