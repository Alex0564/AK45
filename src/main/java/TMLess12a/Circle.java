package TMLess12a;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I draw circle with radius = " + radius);
    }

    @Override
    public double getPerimetr() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
