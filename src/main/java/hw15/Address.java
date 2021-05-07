package hw15;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Address {

    private String streetAddress;
    private String town;
    private String state;
    private int zip;
    private List<Doctor> doctors;

    public Address(String streetAddress, String town, String state, int zip, List<Doctor> doctors) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
        this.doctors = doctors;
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

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String printAddress() {
        return streetAddress+", "+town+", "+state+" "+zip+" "+ doctors.toString();
    }

    public void printDocs() {
        System.out.println(doctors.toString());
    }


}
