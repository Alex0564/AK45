package lesson9op;

public class App {
    public static void main(String[] args) {
        Person devid = new Person();
        devid.setName("Devid");

        System.out.println(devid.getName());
        devid.setYear(1995);
        System.out.println(devid.getYear());

    }
}
