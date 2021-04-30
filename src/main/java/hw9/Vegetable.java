package hw9;

public class Vegetable {
    private String name;
    private double weight;
    private double price;

    public Vegetable(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Vegetable(){}

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void printInfo(){
        System.out.println((name+" on sale, new price is "+price+"$ per "+weight+"lb"));
    }
}
