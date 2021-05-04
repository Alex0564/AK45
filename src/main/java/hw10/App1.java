package hw10;

public class App1 {
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.brand="BMW";
        bmw.color="Black";
        bmw.type=CarType.MINIVAN;
        System.out.println(bmw.getBrand());
        System.out.println(bmw.getColor());
    }
}
