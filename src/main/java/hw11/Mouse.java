package hw11;

public class Mouse {
    private String brand;
    private String model;
    private mouseType mouseType;

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMouseType(mouseType mouseType){this.mouseType=mouseType;}

    //getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public mouseType getMouseType() { return mouseType; }

    //full constructor
    public Mouse(String brand, String model, mouseType mouseType) {
        this.brand = brand;
        this.model = model;
        this.mouseType= mouseType;
    }
}
