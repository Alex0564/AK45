package Lesson9Encapsolytion;

public class App {
    public static void main(String[] args) {
        Person david=new Person();
        david.setName("David");
        System.out.println(david.getName());

        david.setYear(1995);
        System.out.println(david.getYear());
    }
}
