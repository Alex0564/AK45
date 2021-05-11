package homework15x;

import java.net.PortUnreachableException;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital(String hospitalName, Address address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void printInfo(){
        System.out.println("Info about Hospital: " + "\nName: " + hospitalName + ", Address: "+ address);
    }

}
