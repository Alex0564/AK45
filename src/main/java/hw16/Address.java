package hw16;

public class Address {

    private String streetAddress;
    private String country;

    public Address(String streetAddress, String country) {
        this.streetAddress = streetAddress;
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String printAddress() {
        return streetAddress+", "+country ;
    }
}
