package lesson10HW;

public class Fruit {
    protected String name;
    protected String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
