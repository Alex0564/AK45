package hw9;

public class Person {

    private String name;
    private String lastName;
    private int age;

    public void action1() {

        System.out.println(name+" woke up");

    }

    public Person() {}

    public Person(String name, String lastName, int age) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }

    public String getLastName() {

        return lastName;

    }

    public String getName() {

        return name;

    }

    public void printInfo() {

        System.out.println("Person name is "+name+", last name is "+lastName+", age is "+age);

    }
}
