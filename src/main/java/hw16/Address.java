package hw16;

public class Address {
    private String streetLine;
    private String town;
    private String state;
    private int zip;

    public String getStreetLine() {
        return streetLine;
    }

    public void setStreetLine(String streetLine) {
        this.streetLine = streetLine;
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

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String streetLine, String town, String state, int zip) {
        this.streetLine = streetLine;
        this.town = town;
        this.state = state;
        this.zip = zip;

    }

    public void AddressInfo() {
        System.out.println(this.streetLine + ", " + this.town + ", " + this.state + ", " + this.zip);
    }

}
