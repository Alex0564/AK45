package hw9;

import java.util.SplittableRandom;

public class Phone {
    private String name;
    private String model;
    private double price;

    public Phone(String name, String model, double price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Phone(){}

    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(){
        System.out.println((name+" "+model+" - "+price+"$"));
    }
}
