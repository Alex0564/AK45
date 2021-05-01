package hw11vk77;

public class Disk {
    private Brands brand;
    private DiskModel model;
    private  DiskCapacity size;

    public Disk(Brands brand, DiskModel model, DiskCapacity size) {
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

    public DiskModel getModel() {
        return model;
    }

    public void setModel(DiskModel model) {
        this.model = model;
    }

    public DiskCapacity getSize() {
        return size;
    }

    public void setSize(DiskCapacity size) {
        this.size = size;
    }
}
