package lesson10hw;

public class Pet {
    protected String name;
    protected Color color;
    protected int year;
    protected Insurance insurance;

    public Pet() {
    }

    public Pet(String name, Color color, int year, Insurance insurance) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
