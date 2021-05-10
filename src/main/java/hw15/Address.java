package hw15;

public class Address {
    private String streetAddress;
    private String town;
    private String state;
    private int zip;


    public Address(String streetAddress, String town, String state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress(String streetAddress){
        return streetAddress;
    }
    public String getTown(String town){
        return town;
    }
    public String getState(String state){
        return state;
    }
    public int getZip(int zip){
        return zip;
    }

    @Override
    public String toString() {
        return "Address: "+ streetAddress + '\n' + town + '\n' + state + '\n' + zip;
    }

    public void printInfoAddress(String printInfoAddress){
        System.out.println();
    }
}


