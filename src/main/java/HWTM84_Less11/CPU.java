package HWTM84_Less11;

public class CPU {
    private String brand;
    private String model;
    private String socket;
    private int Clock;

    public CPU(String brand, String model, String socket, int clock) {
        this.brand = brand;
        this.model = model;
        this.socket = socket;
        Clock = clock;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getClock() {
        return Clock;
    }

    public void setClock(int clock) {
        Clock = clock;
    }
}
