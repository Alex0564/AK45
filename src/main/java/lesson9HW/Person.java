package lesson9HW;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int y){
        year = y;
    }
    public int getYear(){
        return year;
    }

    public Person(){};

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void printInfo() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '}');
    }
}
