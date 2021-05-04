package dianalesson11;

public class Address {
    private String addressLine1;
    private String city;

    public String getAddressLine1() {
        return addressLine1;
    }

    private State state;
    private String zip;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Address(String addressLine1, String city, State state, String zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
}
