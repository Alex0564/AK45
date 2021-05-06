package lesson11;

public class Address {
    private String addressLine1;
    private String city;
    private State state;
    private int zip;

    public Address(String addressLine1, String city, State state, int zip) {
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }



    public State getState() {
        return state;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setState(State state) {
        this.state = state;
    }
}







