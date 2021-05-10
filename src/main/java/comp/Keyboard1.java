package comp;

public class Keyboard1 {
    private String brand;
    private String model;
    private Type typeKeyboard;

    public Keyboard1(String brand, String model, Type typeKeyboard) {
        this.brand = brand;
        this.model = model;
        this.typeKeyboard = typeKeyboard;
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

    public Type getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(Type typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }
    public void printKeyboard1(){
        System.out.println(brand + model + typeKeyboard);
    }

    @Override
    public String toString() {
        return "Keyboard: " +
                "brand = " + brand +
                ", model = " + model +
                ", typeKeyboard = " + typeKeyboard;
    }
}
