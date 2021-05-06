package hw11ab;

public class Monitor {
    private String brand;
    private String model;
    private int screenSize;

    public Monitor(String brand, String model, int screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
