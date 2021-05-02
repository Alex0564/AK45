package Lesson9a;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public Car(){}
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) { this.model = model; }

    public void setYear(int year) { this.year = year; }

    public String getMake() {return make; }

    public String getModel() { return model; }

    public int getYear() { return year; }

    public void printInfo(){
        System.out.println("My car "+make+" "+model+" was made in "+year+" year.");
    }

    public void printClass(){ System.out.println("Your car "+make+" "+model+" was made in "+year+" year."); }
}
