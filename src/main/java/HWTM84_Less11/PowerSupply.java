package HWTM84_Less11;

public class PowerSupply {
    private String brand;
    private String power;

    public PowerSupply(String brand, String power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
