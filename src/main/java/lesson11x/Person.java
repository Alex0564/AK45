package lesson11x;

public class Person {
    private Address address;
    private String name;
    private String lastNmae;
    private int year;

    public Person(Address address, String name, String lastNmae, int year) {
        this.address = address;
        this.name = name;
        this.lastNmae = lastNmae;
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public void setLastNmae(String lastNmae) {
        this.lastNmae = lastNmae;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
