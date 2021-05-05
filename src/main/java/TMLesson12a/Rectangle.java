package TMLesson12a;

public class Rectangle implements IShape{
    protected double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void draw() {
        System.out.println("I draw rectangle size: "+length+"*"+wide);
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
