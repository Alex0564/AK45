package lesson9HW;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.setName("Anna");
        System.out.println(anna.getName());

        anna.setLastName("Johnson");
        System.out.println(anna.getLastName());

        anna.setYear(2000);
        System.out.println(anna.getYear());

        Person anna = new Person("Anna", "Johnson", 2000);

        anna.prinInfo();


    }
}
