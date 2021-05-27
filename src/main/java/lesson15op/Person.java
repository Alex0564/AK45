package lesson15op;

public class Person {
    private  String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public  static  void sayHello(){
        System.out.println("Hello");
    }

    public String getName() {
        sayHello();
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
