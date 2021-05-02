package ArtuomLesson10HW;

public class App {
    public static void main(String[] args) {
        Bike John=new Bike ( "Bike" , "Tayota", 2021, Colors.RED     );
        System.out.println(John.Brand);
        System.out.println(John.getColors());


        System.out.println("========================Scooter=========================");
        Scooter Art=new Scooter("Scooter", "Tayota",2021,18);

        System.out.println(Art.Brand);


        System.out.println("========================Car=========================");

        Car ver=new Car("Car","Tayota",2021,"Electric");

        ver.printClassCar();



    }
}
