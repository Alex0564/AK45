package hw11;

public class Monitors {
    private String brand;
    private String model;
    private int diag;


    public Monitors(String brand, String model, int diag) {
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
}
