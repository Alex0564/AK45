package hw9;

public class Fish {
    private String name;
    private String type;
    private String color;

    public Fish() {

    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;

    }

    public void setType(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }


    public Fish(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Koi{" + "name='" +
                name + '\'' + ",color='" + color + '\'' +
                ",type='" + type + '}');


    }
}