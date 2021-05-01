package hw11vk77;

public class RAM {
    private Brands brand;
    private RAMmodel model;
    private RAMsize size;

    public RAM(Brands brand, RAMmodel model, RAMsize size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public RAMmodel getModel() {
        return model;
    }

    public void setModel(RAMmodel model) {
        this.model = model;
    }

    public RAMsize getSize() {
        return size;
    }

    public void setSize(RAMsize size) {
        this.size = size;
    }
}
