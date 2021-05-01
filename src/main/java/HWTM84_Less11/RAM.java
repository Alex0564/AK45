package HWTM84_Less11;

public class RAM {
    private String brand;
    private String type;
    private int size;
    private int clock;

    public RAM(String brand, String type, int size, int clock) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.clock = clock;
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

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }
}
