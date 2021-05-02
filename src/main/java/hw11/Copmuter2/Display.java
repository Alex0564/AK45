package hw11.Copmuter2;

public class Display {
    private String brand;
    private int diagonal;
    private String model;

    public Display(String brand, int diagonal, String model) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getModel() {
        return model;
    }
}
