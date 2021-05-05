package homework12;

public class Hexagone implements Shape {

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    double length;
    private double wide;

    public Hexagone(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void draw() {
        System.out.println("I draw hexagone size:"+length+"*"+wide);
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
