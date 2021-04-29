package HWTM84_Less9;

public class Trucks {
    private String model;
    private String make;
    private int year;
    public String license;
    public String driver;

    public void setYear(int year){
        this.year = year;
    }
    public int getYear() {return year;}
    public void setMake(String make){
        this.make = make;
    }
    public String getMake() {return make;}
    public void setModel(String model){ this.model = model; }
    public String getModel() {return model;}
    public void setLicense(String license) {this.license = license;}
    public String getLicense() {return license;}
    public void setDriver(String driver) {this.driver = driver;}
    public String getDriver() {return driver;}

    public void printInfo(){
        System.out.println("Truck: " + "make= " + make + ", model= " + model + ", year= " + year + ", driver= " + driver);
    }
}
