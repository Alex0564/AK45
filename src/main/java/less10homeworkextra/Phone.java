package less10homeworkextra;

public class Phone {
    private Colour colour;
    private Manufacturer brand;
    private Double screen;
    private int memory;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Manufacturer getBrand() {
        return brand;
    }

    public void setBrand(Manufacturer brand) {
        this.brand = brand;
    }

    public Double getScreen() {
        return screen;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Phone(Colour colour, Manufacturer brand, Double screen, int memory) {
        this.colour = colour;
        this.brand = brand;
        this.screen = screen;
        this.memory = memory;

    }
}
