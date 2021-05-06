package lesson12a;

public class Rectangle implements Shape {
    private double length;
    private double wide;

    public Rectangle(double length, double length1) {
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle size:"+length+"*"+wide);
    }

    @Override
    public double getPerimeter() {
        return 2*(length+wide);
    }

    @Override
    public double getArea() {
        return length*wide;
    }
}
