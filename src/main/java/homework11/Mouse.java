package homework11;

public class Mouse {
    private String brand;
    private String mode;

    public Mouse(String brand, String mode) {
        this.brand = brand;
        this.mode = mode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
