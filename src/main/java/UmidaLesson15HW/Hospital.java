package UmidaLesson15HW;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors,
                    Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
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

    public List<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(List<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }
    public void printInfoHospital(){
        for(Map.Entry<Integer,String>entry: rooms.entrySet())
            System.out.println(entry.getValue()+" room # is "+entry.getKey());
    }

    @Override
    public String toString() {
        return "hospitalName: '" + hospitalName + '\'' +
                "\nAddress: " + address +
                "\nDoctors: " + doctors +
                "\nRooms: " + rooms +
                "\nAcceptedInsurances: " + acceptedInsurances;
    }
}
