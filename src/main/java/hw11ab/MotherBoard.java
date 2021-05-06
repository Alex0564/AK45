package hw11ab;

public class MotherBoard {
    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;

    public MotherBoard(String brand, String model, CPU cpu, RAM ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}









