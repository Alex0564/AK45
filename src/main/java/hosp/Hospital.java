package hosp;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, Rooms> rooms;
    private List<InsuranсeCompanies> acceptedInsuranсes;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, Rooms> rooms, List<InsuranсeCompanies> acceptedInsuranсes) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranсes = acceptedInsuranсes;
    }

    public Hospital() {}

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

    public Map<Integer, Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, Rooms> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranсeCompanies> getAcceptedInsuranсes() {
        return acceptedInsuranсes;
    }

    public void setAcceptedInsuranсes(List<InsuranсeCompanies> acceptedInsuranсes) {
        this.acceptedInsuranсes = acceptedInsuranсes;
    }

    @Override
    public String toString() {
        return "Hospital" + "\n" +
                "hospitalName = " + hospitalName + "\n" + address  + "\n" + "Doctors: " + doctors +
                "\nRooms=" + rooms +
                "\nAcceptedInsuranсes=" + acceptedInsuranсes;
    }
}
