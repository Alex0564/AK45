package lesson8AB;

public class Vehicle {
    public int year;
    public String make;
    public String color;
    public String model;

    public void start() {
        System.out.println(make + " " + model + " started engine");
    }

    public void beep() {
        System.out.println(color + " car made beep");
    }
   public String getInfo(){
        return "year="+year+"make="+model+"color="+color;
    }

}