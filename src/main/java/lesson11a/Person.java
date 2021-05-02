package lesson11a;

public class Person {
    private Address address;
    private String name;
    private String LastName;
    private int year;

    public Person(Address address, String name, String lastName, int year) {
        this.address = address;
        this.name = name;
        this.LastName = lastName;
        this.year = year;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getYear() {
        return year;
    }
}
