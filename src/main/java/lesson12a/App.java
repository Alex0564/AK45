package lesson12a;



public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
//        c1.draw();
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//    }
        Rectangle r1 = new Rectangle(2.3, 3.3);
        //r1.draw();
      //
        // System.out.println(r1.getArea());
//        Square s1=new Square(5);
//        r1.draw();
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimeter());

        Rectangle s2=new Square(7);
        Shape c2=new Circle(5);
        Shape r2=new Rectangle(2,3);
        Shape c3=new Square(8);


        Shape [] shapes = {c1,c2,r1,r2,c3,s2};

            for (Shape shape : shapes) {
            shape.draw();
        }
    }
}