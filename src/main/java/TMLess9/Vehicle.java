package TMLess9;

public class Vehicle {
    private String make;
    private String brand;
    private int year;

    public void setYear(int year){
        this.year = year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("Vehicle {" + "make='" + make + '\'' + ", brand='" + brand + '\'' + ", year=" + year + '}');
    }
}
