package Lesson9a;
public class Sneakers {

    private String make;
    private String color;
    private String size;

    public Sneakers(String make, String color,String size){
        this.make = make;
        this.color = color;
        this.size = size;
        ///
    }
    public Sneakers(){}

    public void setMake(String make) {this.make = make;}

    public void setColor(String color) {this.color = color;}

    public void setSize(String size) {this.size = size;}

    public String getMake(String make) {return make;}

    public String getColor(String color) {return color;}

    public String getSize(String size) {return size;}

    public void printInfo(){ System.out.println("My sneakers "+make+" are "+color);}

    public void printClass(){ System.out.println("Yours sneakers "+make+" are "+color);}
}
