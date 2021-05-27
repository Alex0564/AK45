package homeWork15op;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private String zip;

    public Address(String streetAddress, String town, String stat, String zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {

        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {

        this.streetAddress = streetAddress;
    }

    public String getTown() {

        return town;
    }

    public void setTown(String town) {

        this.town = town;
    }

    public String getState() {

        return state;
    }

    public void setStat(String state) {

        this.state = state;
    }

    public String getZip() {

        return zip;
    }

    public void setZip(String zip) {

        this.zip = zip;
    }
    public String infoAddress(){
        return streetAddress+" "+town+" "+state+" "+zip;
    }

}
