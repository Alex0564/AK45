package lesson9vk77;


public class App {
    public static void main(String[] args) {
        Person david = new Person();
        david.setName("");

        System.out.println(david.getName());
        david.setYear(1995);
        System.out.println(david.getYear());

        Vehicle myCar = new Vehicle();
        myCar.setBrand("Accent");
        myCar.setMake("Honda");
        myCar.setYear(1999);

        myCar.printInfo();

    }
}
