package less11homework;

public class RAM {
    private String brand;
    private String model;
    private int size;
    public RAM (String brand, String model, int size){
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getSize(){return size;}

    @Override
    public String toString() {
        return "\nRAM{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}