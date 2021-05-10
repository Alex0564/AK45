package lesson15ExceptionsStatics;

public class Person {
    private String name;
    private String LastName;

    public Person(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public String getName() {
        sayHello();
        return name;
    }

    public String getLastName() {
        return LastName;
    }
}
