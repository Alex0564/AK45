package comp;

public class Monitor1 {
    private String brand;
    private String model;
    private int diag;

    public Monitor1(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
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

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "brand = " + brand +
                ", model = " + model +
                ", diag = " + diag;
    }

    public void printMonitor1(){
        System.out.println(brand + model + diag);
    }
}