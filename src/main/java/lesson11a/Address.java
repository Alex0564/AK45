package lesson11a;

public class Address {
    private String addressLine1;
    private String city;
    private State state;
    private String zip;

    public Address(String addressLine1, String city, State state, String zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
