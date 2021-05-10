package comp;

public class MotherBoard1 {
    private String brand;
    private String model;
    private CPU1 cpu;
    private RAM1 ram;

    public MotherBoard1(String brand, String model, CPU1 cpu, RAM1 ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
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

    public CPU1 getCpu() {
        return cpu;
    }

    public void setCpu(CPU1 cpu) {
        this.cpu = cpu;
    }

    public RAM1 getRam() {
        return ram;
    }

    public void setRam(RAM1 ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "MotherBoard: " +
                "brand = " + brand +
                ", model = " + model + ", " + cpu +
                ", " + ram;
    }

    public void printMotherBoard1(){
        System.out.println(brand + model + cpu + ram);
    }
}
