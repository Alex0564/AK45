package lesson9a;

public class App1 {
    public static void main(String[] args) {
        Person david = new Person();
        david.setName("David");

        System.out.println(david.getName());
        david.getYear(-25);

        Student ann = new Student("Anna","Jonson",2001, "Math");


    }
}
