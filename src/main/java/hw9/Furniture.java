package hw9;

public class Furniture {
    private String name;
    private String color;
    private double price;

    public Furniture(String name, String color, double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Furniture (){}

    public void setName(String n){
        name = n;
    }
    public void setColor(String c){
        color = c;
    }
    public void setPrice(double p){
        price = p;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(){
        System.out.println((name+", "+color+", "+price+"$"));
    }
}
