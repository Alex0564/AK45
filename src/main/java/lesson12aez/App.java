package lesson12aez;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
//        c1.draw();
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimetr());

        Rectangle r1 = new Rectangle(2.3,3.2);
//        r1.draw();
//        System.out.println(r1.getArea());

        Square s1 = new Square(5);
//        s1.draw();
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimetr());

        Rectangle s2 = new Square(7);
        Shape c2 = new Circle(5);
        Shape r2 = new Rectangle(2,3);
        Shape s3 =new Square(8);

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3};


        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
