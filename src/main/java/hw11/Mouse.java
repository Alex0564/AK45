package hw11;

public class Mouse {
    private String brand;
    private String model;
    private String mouseType;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getMouseType() { return mouseType; }
    public void setMouseType(String mouseType) { this.mouseType = mouseType; }

    public Mouse(String brand, String model, String mouseType) {
        this.brand = brand; this.model = model; this.mouseType = mouseType; }
}
