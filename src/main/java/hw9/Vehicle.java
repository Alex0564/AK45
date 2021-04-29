package hw9;

public class Vehicle {

    private String type;
    private String make;
    private String color;
    private int year;

    public void startEngine() {

        System.out.println(make+" started engine");

    }

    public Vehicle() {}

    public Vehicle(String type, String make, String color, int year) {

        this.type = type;
        this.make = make;
        this.color = color;
        this.year = year;

    }

    public void setType(String type) {

        this.type = type;

    }

    public void setMake(String make) {

        this.make = make;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setYear(int year) {

        this.year = year;

    }

    public String getType() {

        return type;

    }

    public String getMake() {

        return make;

    }

    public String getColor() {

        return color;

    }

    public int getYear() {

        return year;

    }

    public void printInfo() {

        System.out.println("Vehicle type is "+type+", make is "+make+", color is "+color+", year is "+year);

    }
}
