package extraLesson;

public class Person {
    protected String name;
    protected String lastName;
    protected   int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public void hello(){
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "name=" + name + ", lastName=" + lastName + ", year=" + year +
                '}';
    }
}
