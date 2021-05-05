package TMLesson12a;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
//        c1.draw();
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimetr());
        Rectangle r1 = new Rectangle(2.3,3.3);
//        r1 .draw();
//        System.out.println(r1.getArea());
        Square s1 = new Square(5);
//        s1.draw();
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimetr());
        Rectangle s2 = new Square(7);
        IShape c2 = new Circle(5);
        IShape r2 = new Rectangle(2,3);
        IShape s3 = new Square(8);

        IShape[] shapes = {c1, c2, r1, r2, s1, s2, s3};


        for (IShape shape: shapes){
            shape.draw();
        }
    }
}
