package UmidaLesson13HW;

public class Spice {
    private String name;
    private String color;
    private String taste;

    public Spice(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
