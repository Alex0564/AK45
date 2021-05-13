package less15homework;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompanies> acceptInsurances;

    public Hospital() {
    }

    public Hospital(String hospitalName, Address address,
                    List<Doctor> doctors,
                    Map<Integer, String> rooms,
                    List<InsuranceCompanies>
                            acceptInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptInsurances = acceptInsurances;
    }
    public Hospital(String nyu_langone_hospitals, Address addressOfNYULH, Doctor maher, int i, InsuranceCompanies anthem) {
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getAcceptInsurances() {
        return acceptInsurances;
    }

    public void setAcceptInsurances(List<InsuranceCompanies> acceptInsurances) {
        this.acceptInsurances = acceptInsurances;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptInsurances=" + acceptInsurances +
                '}';
    }
}
