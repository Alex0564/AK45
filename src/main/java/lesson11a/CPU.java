package lesson11a;

public class CPU {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPU(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
