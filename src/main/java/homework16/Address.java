package homework16;

public class Address {
    private String street;
    private String town;
    private String state;
    private String zip;

    public Address(String street, String number, String state, String zip) {
        this.street = street;
        this.town = number;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return town;
    }

    public void setNumber(String number) {
        this.town = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street+", "+town+", "+state+" "+zip;
    }
}
