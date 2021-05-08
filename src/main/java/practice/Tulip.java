package practice;

public class Tulip extends Flower{
    private String color;
    private int cost;

    public Tulip(String name, int year, String color, int cost) {
        super(name, year);
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        "\nColor: " + color +
                        "\nYear: " + getYear()+
                        "\nCost " + cost);
    }
}
