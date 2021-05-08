package hw16vk77;

public class Address {
    private String city;
    private String state;
    private String street;
    private int buildingnumber;
    private String zip;

    public Address() {
    }

    public Address(String city, String state, String street, int buildingnumber, String zip) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.buildingnumber = buildingnumber;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getbuildingnumber() {
        return buildingnumber;
    }

    public void setbuildingnumber(int buildingnumber) {
        this.buildingnumber = buildingnumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    public void AddressInfo(){
        System.out.println(this.buildingnumber+" "+this.street+" "+this.city+", "+this.state+", "+this.zip);
    }

    public String getAddress(){
        return this.buildingnumber+" "+this.street+" "+this.city+", "+this.state+", "+this.zip;
    }
    public void  setAddress(String city, String state, String street, int buildingnumber, String zip){
        this.buildingnumber = buildingnumber;
        this.street = street;
        this.city = city;
        this.state=state;
        this.zip=zip;
    }


}
