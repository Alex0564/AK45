package hw9;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private String color;

    // Setters:

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 2021 || year < 1950) {
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Getters:

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // printInfo method:

    public void printInfo() {
        System.out.println(
                "Make = '" + make + '\'' +
                        ", model = '" + color + '\'' +
                        ", year = " + year);
    }

    // constructor:
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        setYear(year);
        this.color = color;
    }

    // default constructor:

    public Vehicle() {
    }
}
