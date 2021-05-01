package HWTM84_Less11;

public class HDD {
    private String brand;
    private String type;
    private int size;

    public HDD(String brand, String type, int size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
