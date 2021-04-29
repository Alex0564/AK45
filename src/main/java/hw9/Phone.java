package hw9;

public class Phone {

    private String make;
    private int price;
    private String color;
    private String model;

    public void call() {

        System.out.println(model+" is ringing");

    }

    public Phone() {}

    public Phone(String make, int price, String color, String model) {

        this.make = make;
        this.price = price;
        this.color = color;
        this.model = model;

    }

    public void setMake(String make) {

        this.make = make;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public String getMake() {

        return make;

    }

    public int getPrice() {

        return price;

    }

    public String getColor() {

        return color;

    }

    public String getModel() {

        return model;

    }

    public void printInfo() {

        System.out.println("Phone make is "+make+", model is "+model+", color is "+color+", price is "+price);

    }
}
