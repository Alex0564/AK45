package homework12;

public class Triangle implements Shape{

    private double radius;


    public Triangle(double radius) {
        this.radius = radius;
    }

    @Override

    public void draw() {
        System.out.println("I draw triangle");
    }

     @Override
    public double getPerimeter() {
        return 4*radius*Math.PI;
    }


     @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
