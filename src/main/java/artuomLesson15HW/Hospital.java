package artuomLesson15HW;



import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private List<InsuranseCompanies> acceptedInsuranses;
    private Map<Integer, RoomsNames> rooms;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, List<InsuranseCompanies> acceptedInsuranses, Map<Integer, RoomsNames> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.acceptedInsuranses = acceptedInsuranses;
        this.rooms = rooms;
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

    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Map<Integer, RoomsNames> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, RoomsNames> rooms) {
        this.rooms = rooms;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", acceptedInsuranses=" + acceptedInsuranses +
                ", rooms=" + rooms +
                '}';
    }
}