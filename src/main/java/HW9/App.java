package HW9;

public class App {
public static void main(String[] args) {
    Person james;
    james = new Person();
    james.name = "James";
    james.lastName = "Dias";
    james.year = 1989;
    System.out.println(james.name);

    System.out.println("*****************");
    Vehicle myCar = new Vehicle();
    Vehicle newCar = new Vehicle("made in somewhere", "red", "1999");
    newCar.print_info();





}
}