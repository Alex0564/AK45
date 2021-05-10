package hw12;

public class ColumnFoundation implements IConstruction{

    private double radius;
    private double high;

    public ColumnFoundation(double radius, double high) {
        this.radius = radius;
        this.high = high;
    }

    @Override
    public double getArea() {
        return Math.PI*radius;
    }

    @Override
    public double getVolume() {
        return getArea()*high;
    }
}
