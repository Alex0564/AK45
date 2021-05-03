package hw11;

public class Monitor {
    private String brand;
    private String model;
    private String size;
    private MonitorType monitorType;


    public Monitor(String brand, String model, String size, MonitorType monitorType) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.monitorType = monitorType;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
    }
}
