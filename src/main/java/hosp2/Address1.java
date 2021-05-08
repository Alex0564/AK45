package hosp2;

public class Address1 {
    private String streetAddress1;
    private String town1;
    private String state1;
    private int zip1;

    public Address1(String streetAddress1, String town1, String state1, int zip1) {
        this.streetAddress1 = streetAddress1;
        this.town1 = town1;
        this.state1 = state1;
        this.zip1 = zip1;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getTown1() {
        return town1;
    }

    public void setTown1(String town1) {
        this.town1 = town1;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public int getZip1() {
        return zip1;
    }

    public void setZip1(int zip1) {
        this.zip1 = zip1;
    }
    public void printAddress1(){
        System.out.println(streetAddress1 + town1 + state1 + zip1);
    }

    @Override
    public String toString() {
        return streetAddress1 + ", " + town1 + ", " + state1 + ", " + zip1;
    }
}
