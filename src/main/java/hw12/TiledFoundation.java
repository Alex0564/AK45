package hw12;

public class TiledFoundation implements IConstruction {
    private double side1;
    private double side2;
    private double high;

    public TiledFoundation(double side1, double side2, double high) {
        this.side1 = side1;
        this.side2 = side2;
        this.high = high;
    }

    @Override
    public double getArea() {
        return side1*side2;
    }

    @Override
    public double getVolume() {
        return getArea()*high;
    }
}
