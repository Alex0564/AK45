package lesson12aez;

public class Rectangle implements Shape{
    protected double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle with size: "+length+"*"+wide);
    }

    @Override
    public double getPerimetr() {
        return 2*(length+wide);
    }

    @Override
    public double getArea() {
        return length*wide;
    }
}
