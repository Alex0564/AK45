package HWTM84_Less11;

public class VGA {
    private String brand;
    private int ram;

    public VGA(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
