package lesson11op;

public class Address {
    private String addressline1;
    private String city;
    private State state;
    private String zip;

    public Address(String addressline1, String city, State state, String zip) {
        this.addressline1 = addressline1;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}


