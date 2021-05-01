package UmidaLesson11HW;

public class Disk {
    private  String model;
    private  String brand;
    private  int size;

    public Disk(String model, String brand, int size) {
        this.model = model;
        this.brand = brand;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
