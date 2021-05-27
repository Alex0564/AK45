package homework.homework11;

public class MotherBoard {
    public MotherBoard(String brand, String model, CPU cpu, RAM ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
    }

    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;

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
}
