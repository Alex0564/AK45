package hw9;

public class Beverage {
   private String name;
   private double volume;
   private double price;

   public Beverage(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }
}
