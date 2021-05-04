package lesson10HW;

public class Pear extends Fruit{
    private String name;
    private String color;

    public Pear() {
    }

    public Pear(String name, String color) {
        this.name = name;
        this.color = color;
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

    @Override
    public String toString() {
        return "Pear{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
