package homework9;

public class Calc {
    private double a;
    private double b;
    private double c;
    private double area;

    public Calc( double a, double b) {
        this.a = a;
        this.b = b;

    }
    public Calc() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.area = area;
    }

    public void setA (double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }

    public void setB (double b) {
        this.b = b;
    }
    public double getB () {
        return b;
    }

    public void setC (double c) {
        this.c = c;
    }
    public double getC() {
        return c = a + b;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area = 3.14 *( a * a );
    }
}
