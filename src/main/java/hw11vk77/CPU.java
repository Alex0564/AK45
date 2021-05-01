package hw11vk77;

public class CPU {
    private Brands brand;
    private CPUmodel model;

    public CPU(Brands brand, CPUmodel model) {
        this.brand = brand;
        this.model = model;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public CPUmodel getModel() {
        return model;
    }

    public void setModel(CPUmodel model) {
        this.model = model;
    }
}
