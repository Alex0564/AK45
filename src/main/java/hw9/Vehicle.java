package hw9;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private VehicleColor color;

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
    // using enum in setter:

    public void setColor(VehicleColor color) {
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

    // using enum in getter:

    public VehicleColor getColor() {
        return color;
    }

    // printInfo method:

    public void printInfo() {
        System.out.println(
                "Make = '" + make + '\'' +
                        ", model = '" + color + '\'' +
                        ", year = " + year);
    }

    // constructor using enum:

    public Vehicle(String make, String model, int year, VehicleColor color) {
        this.make = make;
        this.model = model;
        setYear(year);
        this.color = color;
    }

    // default constructor:

    public Vehicle() {
    }
}
