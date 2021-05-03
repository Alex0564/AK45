package lesson11ez;

public class House {
    private Address address;
    private Person owner;
    private int bedrooms;
    private int bathrooms;
    private int year;

    public House(Address address, Person owner, int bedrooms, int bathrooms, int year) {
        this.address = address;
        this.owner = owner;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public Person getOwner() {
        return owner;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getYear() {
        return year;
    }
}
