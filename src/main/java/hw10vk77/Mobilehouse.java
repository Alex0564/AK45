package hw10vk77;

public class Mobilehouse extends House{
    private String tires;
    private String Engine;

    public Mobilehouse(String tires, String engine) {
        this.tires = tires;
        Engine = engine;
    }

    public Mobilehouse(int rooms, int bathroom, String entrance, String roof, String tires, String engine) {
        super(rooms, bathroom, entrance, roof);
        this.tires = tires;
        Engine = engine;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }
}
