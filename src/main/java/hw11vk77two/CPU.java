package hw11vk77two;

public class CPU {
    private String brand;
    private String model;
    private double Frequence;

    public CPU(String brand, String model, double Frequence) {
        this.brand = brand;
        this.model = model;
        this.Frequence=Frequence;
    }

    public double getFrequence() {
        return Frequence;
    }

    public void setFrequence(double frequence) {
        Frequence = frequence;
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
    public String Cpubrand(){
        return brand;
    }
}
