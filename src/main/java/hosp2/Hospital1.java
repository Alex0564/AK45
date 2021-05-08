package hosp2;

import java.util.List;
import java.util.Map;

public class Hospital1 {
    private String hospitalName1;
    private Address1 address1;
    private List<Doctor1> doctors1;
    private Map<Integer, Rooms1> rooms1;
    private List<InsuranceCompanies1> acceptedInsuranсes1;

    public Hospital1(String hospitalName1, Address1 address1, List<Doctor1> doctors1, Map<Integer, Rooms1> rooms1, List<InsuranceCompanies1> acceptedInsuranсes1) {
        this.hospitalName1 = hospitalName1;
        this.address1 = address1;
        this.doctors1 = doctors1;
        this.rooms1 = rooms1;
        this.acceptedInsuranсes1 = acceptedInsuranсes1;
    }

    public String getHospitalName1() {
        return hospitalName1;
    }

    public void setHospitalName1(String hospitalName1) {
        this.hospitalName1 = hospitalName1;
    }

    public Address1 getAddress1() {
        return address1;
    }

    public void setAddress1(Address1 address1) {
        this.address1 = address1;
    }

    public List<Doctor1> getDoctors1() {
        return doctors1;
    }

    public void setDoctors1(List<Doctor1> doctors1) {
        this.doctors1 = doctors1;
    }

    public Map<Integer, Rooms1> getRooms1() {
        return rooms1;
    }

    public void setRooms1(Map<Integer, Rooms1> rooms1) {
        this.rooms1 = rooms1;
    }

    public List<InsuranceCompanies1> getAcceptedInsuranсes1() {
        return acceptedInsuranсes1;
    }

    public void setAcceptedInsuranсes1(List<InsuranceCompanies1> acceptedInsuranсes1) {
        this.acceptedInsuranсes1 = acceptedInsuranсes1;
    }
    public void printInfo(){
        System.out.println("Hospital Name" + hospitalName1 + "\nAddress: " + address1 + "\nDoctors = " + doctors1 + "\nRooms: " + rooms1 + "\nInsurance: " + acceptedInsuranсes1);
    }

}
