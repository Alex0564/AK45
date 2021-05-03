package hw11;

public class Disk {
    private String brand;
    private String model;
    private String storageCapacity;
    private HardDriveType hardDriveType;

    public Disk(String brand, String model, String storageCapacity, HardDriveType hardDriveType) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.hardDriveType = hardDriveType;
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

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public HardDriveType getHardDriveType() {
        return hardDriveType;
    }

    public void setHardDriveType(HardDriveType hardDriveType) {
        this.hardDriveType = hardDriveType;
    }
}


