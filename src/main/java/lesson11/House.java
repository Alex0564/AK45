package lesson11;

public class House {
    private final Address address;
    private final Person owner;
    private final int bedrooms;
    private final int bathrooms;
    private final int year;

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
