package less11homework;

public class MotherBoard {
    private String brand;
    private String model;
    private CPU cpu;
    private RAM ram;
    public MotherBoard (String brand, String model, CPU cpu, RAM ram){
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public CPU getCpu(){return cpu;}
    public RAM getRam() {return ram;}

    @Override
    public String toString() {
        return "\nMotherBoard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }
}