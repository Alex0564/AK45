package hw14vk77;

public class Person {
    public String name;
    public String lastName;
    private String city;
    private int age;

    public Person(String name, String lastName, String city, int age) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void hello(){
        System.out.println("Hello, my name is"+this.name+" "+this.lastName+". Nice to meet you! I am "+this.age+" years old and I live in "+this.city+" city." );
    }
}
