package hw11;

public class GraphicAdapter {
    private String brand;
    private String model;

    // getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    //setters

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) {
        this.model = model;
    }

    //full cobstructor
    public GraphicAdapter(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
