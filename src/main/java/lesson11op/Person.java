package lesson11op;

public class Person {
    private Address address;
    private String name;
    private String lastName;
    private int year;



    public Person(Address address, String name, String lastName, int year){
        this.address = address;
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



