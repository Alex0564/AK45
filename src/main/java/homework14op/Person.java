package homework14op;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private  int year;

    public Person(String name, String lastName, String city, int year) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void hello(){
        System.out.println("Hello, my name is"+this.name+" "+this.lastName+". Nice to meet you!");

    }
}
