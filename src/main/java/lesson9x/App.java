package lesson9x;

public class App {
    public static void main(String[] args) {
        Person david = new Person();
        david.setName("David");
        System.out.println(david.getName());

        david.setYear(2001);
        System.out.println(david.getYear());


        Vehicle myCar=new Vehicle();
        myCar.setBrand("Accord");
        myCar.setMake("Honda");
        myCar.setYear(2012);

        myCar.printInfo();


    }
}
