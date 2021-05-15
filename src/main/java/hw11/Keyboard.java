package hw11;

public class Keyboard {
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

    //full constructor
    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
