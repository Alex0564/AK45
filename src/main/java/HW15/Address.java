package HW15;

public class Address {
private String streetAddress;
private String city;
private String state;
private int zip;

    public Address(String streetAddress, String city, String state, int zip) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

        public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
    public String addressInfo(){
        return streetAddress+"\n"+city+", "+state+", "+zip;
    }

    }


