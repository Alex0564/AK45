package hw11;

public class CPU {
    private String brand;
    private String model;

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //getters

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

//public constructor
    public CPU(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

}
