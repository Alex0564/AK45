package lesson11vk77;

public class Address {
    private String addressLin1;
    private String city;
    private State state;
    private String zipcode;

    public Address(String addressLin1, String city, State state, String zipcode) {
        this.addressLin1 = addressLin1;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAddressLin1() {
        return addressLin1;
    }

    public void setAddressLin1(String addressLin1) {
        this.addressLin1 = addressLin1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
