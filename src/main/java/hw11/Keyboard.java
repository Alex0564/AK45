package hw11;

public class Keyboard {

    private String brand;
    private String model;
    private DevTypes type;

    public Keyboard(String brand, String model, DevTypes type) {

        this.brand = brand;
        this.model = model;
        this.type = type;

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

    public DevTypes getType() {
        return type;
    }

    public void setType(DevTypes type) {
        this.type = type;
    }
}
