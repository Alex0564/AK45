package less11homework;

public class Mouse {
    private String brand;
    private String model;
    public Mouse (String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}

    @Override
    public String toString() {
        return "\nMouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
