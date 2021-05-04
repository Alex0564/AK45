package hw11;

public class Mouse {
    private String brand;
    private String model;
    private String sensorstype;
    private String Connectiontype;

    public Mouse(String brand, String model, String sensorstype, String connectiontype) {
        this.brand = brand;
        this.model = model;
        this.sensorstype = sensorstype;
        Connectiontype = connectiontype;
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

    public String getSensorstype() {
        return sensorstype;
    }

    public void setSensorstype(String sensorstype) {
        this.sensorstype = sensorstype;
    }

    public String getConnectiontype() {
        return Connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        Connectiontype = connectiontype;
    }
}
