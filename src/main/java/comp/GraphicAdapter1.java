package comp;

public class GraphicAdapter1 {
    private String brand;
    private String model;

    public GraphicAdapter1(String brand, String model) {
        this.brand = brand;
        this.model = model;
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
    public void printGraphicAdapter1(){
        System.out.println(brand + model);
    }

    @Override
    public String toString() {
        return "GraphicAdapter: " +
                "brand = " + brand +
                ", model = " + model;
    }
}
