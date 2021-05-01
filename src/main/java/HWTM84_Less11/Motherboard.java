package HWTM84_Less11;

public class Motherboard {
    private String brand;
    private CPU cpu;
    private RAM ram;

    public Motherboard(String brand, CPU cpu, RAM ram) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
