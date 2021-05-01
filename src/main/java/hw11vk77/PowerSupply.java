package hw11vk77;

public class PowerSupply {
    private Brands brand;
    private PowerSupplyModel model;

    public PowerSupply(Brands brand, PowerSupplyModel model) {
        this.brand = brand;
        this.model = model;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public PowerSupplyModel getModel() {
        return model;
    }

    public void setModel(PowerSupplyModel model) {
        this.model = model;
    }
}
