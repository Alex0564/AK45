package hw11vk77;

public class Keyboard {
    private Brands brand;
    private KeyboardModel model;
    private Connectiontypes connected;

    public Keyboard(Brands brand, KeyboardModel model, Connectiontypes connected) {
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

    public KeyboardModel getModel() {
        return model;
    }

    public void setModel(KeyboardModel model) {
        this.model = model;
    }

    public Connectiontypes getConnected() {
        return connected;
    }

    public void setConnected(Connectiontypes connected) {
        this.connected = connected;
    }
}
