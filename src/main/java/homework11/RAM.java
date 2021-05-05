package homework11;

public class RAM {
    private String brand;
    private String model;
    private int size;

    public RAM(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public RAM(int platinumRgb, String coisarDominator) {

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


    public void print_info() {
        System.out.println("RAM:" +
                "brand:" + brand + '\'' +
                ", model:" + model + '\'' +
                ", size:" + size);
    }
}
