package HW9;

public class Vehicle {
    private String make;
    private String color;
    private String year;

    public Vehicle(String make, String color, String year) {
        this.make = make;
        this.color = color;
        this.year = year;
    }


    public Vehicle() { }

    public String getMake(){
        return make;

    }

    public String getColor(){
        return color;

    }

    public String getYear(){
        return year;

    }

    public void setMake(String make) {

        this.make = make;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setYear(String year) {

        this.year = year;
    }


    public void print_info() {
        System.out.println("Vehicle:" +
                "make: " + make + '\'' +
                ", color: " + color + '\'' +
                ", year: " + year);
    }
}



