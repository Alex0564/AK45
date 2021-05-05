package hw11df.hw11;

public class Monitor {
    private String brand;
    private String model;
    private int diag;

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

    public Monitor(String brand, String model, int diag) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;

    }
}
