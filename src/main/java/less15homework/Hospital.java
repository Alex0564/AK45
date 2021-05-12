package less15homework;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranseCompamies> acceptInsurances;

    public Hospital() {
    }

    public Hospital(String hospitalName, Address address,
                    List<Doctor> doctors,
                    Map<Integer, String> rooms,
                    List<InsuranseCompamies>
                            acceptInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptInsurances = acceptInsurances;
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

    public List<InsuranseCompamies> getAcceptInsurances() {
        return acceptInsurances;
    }

    public void setAcceptInsurances(List<InsuranseCompamies> acceptInsurances) {
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
