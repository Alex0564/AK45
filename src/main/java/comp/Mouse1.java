package comp;

public class Mouse1 {
    private String brand;
    private String model;
    private Type typeMouse;

    public Mouse1(String brand, String model, Type typeMouse) {
        this.brand = brand;
        this.model = model;
        this.typeMouse = typeMouse;
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

    public Type getTypeMouse() {
        return typeMouse;
    }

    public void setTypeMouse(Type typeMouse) {
        this.typeMouse = typeMouse;
    }
    public void printMouse1(){
        System.out.println(brand + model + typeMouse);
    }

    @Override
    public String toString() {
        return "Mouse: " +
                "brand = " + brand +
                ", model = " + model +
                ", typeMouse = " + typeMouse;
    }
}
