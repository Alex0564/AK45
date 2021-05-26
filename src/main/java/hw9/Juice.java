package hw9;

public class Juice {
    private String name;
    private String type;
    private String size;

    public Juice() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Tropicana{" + "name='" +
                name + '\'' + ",size='" + size + '\'' +
                ",type='" + type + '}');
    }

    public Juice(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
}

