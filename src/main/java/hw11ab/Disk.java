package hw11ab;

public class Disk {
    private String brand;
    private String model;
    private double usb;

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

    public double getUsb() {
        return usb;
    }

    public void setUsb(double usb) {
        this.usb = usb;
    }

    public Disk(String brand, String model, double usb) {
        this.brand = brand;
        this.model = model;
        this.usb = usb;
    }
}
