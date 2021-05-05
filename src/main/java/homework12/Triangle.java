package homework12;

public class Triangle implements Shape{
    private double radius;

    public Triangle(double radius) {
        this.radius = radius;
    }


    public void draw() {
        System.out.println("I draw triangle");
    }


    public double getPerimeter() {
        return 4*radius*Math.PI;
    }


    public double getArea() {
        return Math.PI*radius*radius;
    }
}
