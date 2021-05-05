package hm11a;

public class Mouse {
    private String brand;
    private String model;
    private Type type;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Mouse(String brand, String model, Type type) {
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

}
