package lesson12avk77;

public class Rectangle implements Shape{
    protected double length;
    private double width;

    @Override
    public void draw() {
        System.out.println("I draw rectangle with size = "+length+"*"+width);
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
