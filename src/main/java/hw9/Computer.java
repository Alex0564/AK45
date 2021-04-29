package hw9;

public class Computer {

    private String make;
    private String model;
    private String oc;
    private int price;

    public void sleepMode() {

        System.out.println(model+" goes into Sleep Mode");

    }

    public Computer() {}

    public Computer(String make, String model, String oc,int price) {

        this.make = make;
        this.model = model;
        this.oc = oc;
        this.price = price;

    }

    public void setMake(String make) {

        this.make = make;

    }

    public void setModel(String model) {

        this.model = model;

    }

    public void setOc(String oc) {

        this.oc = oc;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public int getPrice() {

        return price;

    }

    public String getMake() {

        return make;

    }

    public String getModel() {

        return model;

    }

    public String getOc() {

        return oc;

    }

    public void printInfo() {
        System.out.println("Computer make is "+make+", model is "+model+", oc is "+oc+", and price is "+price);
    }
}
