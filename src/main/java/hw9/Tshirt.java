package hw9;

public class Tshirt {
    private String name;
    private String size;
    private double price;

    public Tshirt(String name, String size, double price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
