package artuomLesson14HW;

public class Address {
    private String street;
    private String city;
    private int house;
    private  String zipcode;

    public Address(String street, String city, int house, String zipcode) {
        this.street = street;
        this.city = city;
        this.house = house;
        this.zipcode = zipcode;


    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void printInfo1() {
        System.out.println( "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", house=" + house +
                ", zipcode='" + zipcode + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", house=" + house +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
