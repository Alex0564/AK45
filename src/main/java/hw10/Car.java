package hw10;

public class Car {
    protected String name;
    protected String model;
    protected String color;
    protected int year;
    protected double price;

    public Car() {
    }

    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
