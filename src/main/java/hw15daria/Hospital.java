package hw15daria;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranseCompamies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void setHospitalName (String hospitalName){ this.hospitalName = hospitalName; }
    public String getHospitalName () { return hospitalName; }
    public void setAddress (Address address){ this.address = address; }
    public Address getAddress () { return address; }

//  public Hospital(List<Doctor> doctors) { this.doctors = doctors; }
    public List<Doctor> getDoctors() { return doctors; }
    public void setDoctors(List<Doctor> doctors) { this.doctors = doctors; }

    public Map<Integer, String> getRooms() { return rooms; }
    public void setRooms(Map<Integer, String> rooms) { this.rooms = rooms; }
    public Hospital(Map<Integer, String> rooms) { this.rooms = rooms; }

    public List<InsuranseCompamies> getAcceptedInsuranses() { return acceptedInsuranses; }
    public void setAcceptedInsuranses(List<InsuranseCompamies> acceptedInsuranses) { this.acceptedInsuranses = acceptedInsuranses; }
    public Hospital(List<InsuranseCompamies> acceptedInsuranses) { this.acceptedInsuranses = acceptedInsuranses; }

    public void printHospital(){ System.out.println("The name of the hospital is: "+ this.hospitalName+
            "and the Address is: "+this.address+". The list of the doctors is: "+this.doctors+". List of" +
            "the rooms is: "+this.rooms+". And the accepted Insurance companies are: "+this.acceptedInsuranses); }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }
}
