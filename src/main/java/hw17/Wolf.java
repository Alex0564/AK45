package hw17;

public class Wolf extends Carnivores{
    private String name;

    public Wolf(String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
