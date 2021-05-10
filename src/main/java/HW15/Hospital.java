package HW15;

import java.util.List;
import java.util.Map;

public class Hospital {
private String hospitalName;
private Address address;
private List<Doctor> doctors;
private Map<Integer, String> rooms;
private List<InsuranceCompanies> acceptedInsurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurance = acceptedInsurance;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public List<InsuranceCompanies> getAcceptedInsurance() {
        return acceptedInsurance;
    }

//    public String printHospital(){
//        return hospitalName+"\n"+address+"\n"+doctors+"\n"+rooms+"\n"+acceptedInsurance;
//    }
}

