package HW9;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int odometer;
    private String color;


    public Vehicle(String make, String model, int year, int odometer) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = odometer;


    }
    public Vehicle(){}
    public void setMake(String make){this.make=make;}
    public void setModel(String model){this.model=model;}
    public void setYear(int year){this.year=year;}
    public void setOdometer(int odometer){this.odometer=odometer;}




    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public int getOdometer(){
        return odometer;
    }

    public void printInfo() {
        System.out.println("Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + '\''+
                ", odometer="+odometer+'\''+
                '}');
    }

}
