package Lesson9a;

public class Bike {

    private String make;
    private String color;
    private int speeds;

    public  Bike(String make, String color, int speeds){
        this.make = make;
        this.color = color;
        this.speeds = speeds;
    }

    public Bike(){}

    public void setMake(String make) {this.make = make;}

    public void setColor(String color) {this.color = color;}

    public void setSpeeds(int speeds) {this.speeds = speeds;}


    public String getMake(String make) {return make;}

    public String getColor(String color) {return color;}

    public int getSpeeds(int speeds) {return speeds;}


    public void printInfo () {System.out.println("My bike "+make+", "+color+" color, is a single speed");}

    public void printClass () {System.out.println("Your bike "+make+" "+color+" color, has "+speeds+" speeds");}
}



