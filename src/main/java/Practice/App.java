package Practice;

public class App {
    public static void main(String[] args) {

        // Member access and Inheritance

        Flower ff = new Flower("Camile", 6);
        ff.printInfo();
        System.out.println(ff.getYear());
        System.out.println(ff.getName());
        System.out.println();

        Flower ff1 = new Flower("Tulip", 3);
        ff1.printInfo();
        System.out.println();

        Rose rr = new Rose("Rose", "White");
        rr.printInfo();
        System.out.println(rr.getName());
        System.out.println(rr.getColor());

    }

}
