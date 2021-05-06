package hw13vk77;

public class Ball {

    private String material;
    private String color;
    private String size;
    public String type;

    public Ball(String material, String color, String size, String type) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
