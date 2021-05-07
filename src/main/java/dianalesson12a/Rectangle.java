package dianalesson12a;

public class Rectangle implements Shape{
    private  double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle");
    }

    @Override
    public double getPerimeter() {
        return 2*(length+wide);
    }

    @Override
    public double getAria() {
        return length*wide;
    }
}
