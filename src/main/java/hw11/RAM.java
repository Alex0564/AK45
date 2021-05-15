package hw11;

public class RAM {
    private String brand;
    private String model;
    private int size;

    // getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSize() {
        return size;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setSize(int size) {
        this.size = size;
    }

    //full constructor
    public RAM(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
}
