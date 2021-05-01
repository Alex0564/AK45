package hw11vk77;

public class MotherBoard {
    private  Brands  brand;
    private MBmodel model;
    private CPU cpu;
    private RAM ram;

    public MotherBoard(Brands brand, MBmodel model, CPU cpu, RAM ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public MBmodel getModel() {
        return model;
    }

    public void setModel(MBmodel model) {
        this.model = model;
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
