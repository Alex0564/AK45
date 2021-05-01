package hw11vk77;

public class Mouse {
    private  Brands brand;
    private MouseType model;
    private Connectiontypes connected;

    public Mouse(Brands brand, MouseType model, Connectiontypes connected) {
        this.brand = brand;
        this.model = model;
        this.connected = connected;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public MouseType getModel() {
        return model;
    }

    public void setModel(MouseType model) {
        this.model = model;
    }

    public Connectiontypes getConnected() {
        return connected;
    }

    public void setConnected(Connectiontypes connected) {
        this.connected = connected;
    }
}
