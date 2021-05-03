package hw11;

public class RAM {
    private String brand;
    private String model;
    private String capacity;

    public RAM(String brand, String model, String capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
