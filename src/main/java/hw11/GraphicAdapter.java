package hw11;

public class GraphicAdapter {
    private String brand;
    private String model;
    public GraphicAdapter (String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}

    @Override
    public String toString() {
        return "\nGraphicAdapter{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
