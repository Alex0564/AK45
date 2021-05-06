package lesson11;

public class Person {
    private Address address;
    private String name;
    private String lastName;
    private int year;

    public Person(Address address, String name, String lastName, int year) {
        this.address = address;
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public Address getAddress() {
        return address;
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
}


