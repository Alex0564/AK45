package comp;

public class RAM1 {
    private String brand;
    private String model;
    private int size;

    public RAM1(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void printRAM1(){
        System.out.println(brand + model + size);
    }

    @Override
    public String toString() {
        return "RAM: " +
                "brand = " + brand +
                ", model = " + model +
                ", size = " + size + "]";
    }
}
