package homeWork15op;

import lesson11op.Address;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String> room;
    private List<InsuranceCompanies> acceptedInsurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> room, List<InsuranceCompanies> acceptedInsurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.room = room;
        this.acceptedInsurance = acceptedInsurance;
    }

    public Hospital(String baystate, homeWork15op.Address address, List<Doctor> doctors, HashMap<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurance) {
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

    public Map<Integer, String> getRoom() {
        return room;
    }

    public void setRoom(Map<Integer, String> room) {
        this.room = room;
    }

    public List<InsuranceCompanies> getAcceptedInsurance() {
        return acceptedInsurance;
    }

    public void setAcceptedInsurance(List<InsuranceCompanies> acceptedInsurance) {
        this.acceptedInsurance = acceptedInsurance;
    }

}
