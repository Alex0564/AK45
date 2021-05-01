package hw11vk77;

public class Monitor {
    private  Brands brand;
    private MonitorModel model;
    private int diag;
    private Connectiontypes connected;

    public Monitor(Brands brand, MonitorModel model, int diag, Connectiontypes connected) {
        this.brand = brand;
        this.model = model;
        this.diag = diag;
        this.connected = connected;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public MonitorModel getModel() {
        return model;
    }

    public void setModel(MonitorModel model) {
        this.model = model;
    }

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public Connectiontypes getConnected() {
        return connected;
    }

    public void setConnected(Connectiontypes connected) {
        this.connected = connected;
    }
}
