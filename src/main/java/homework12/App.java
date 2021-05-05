package homework12;

public class App {
    public static void main(String[] args) {
       Triangle t1 = new Triangle(6.2);
       t1.draw();
       System.out.println(t1.getArea());
       System.out.println(t1.getArea());

       Hexagone h1 = new Hexagone(5.3, 6.2);
               h1.draw();

               Octagon o1 = new Octagon(2.5);
               o1.draw();

               System.out.println(h1.getArea());
    }
}
