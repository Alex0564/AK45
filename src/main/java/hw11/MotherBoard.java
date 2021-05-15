package hw11;

public class MotherBoard {
    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;

    //getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public CPU getCpu() {
        return cpu;
    }
    public RAM getRam() {
        return ram;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    //full constructor
    public MotherBoard(String brand, String model, CPU cpu, RAM ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
    }
}
