package hw15;

import java.util.List;
import java.util.Map;

public class Hospital {

    private String hospitalName;
    private Address address;
    private Map<Integer,String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, Map<Integer, String> rooms, List<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
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

    public void printOutRooms() {
        System.out.println(rooms);
    }


    public void printRooms() {

        for (Map.Entry<Integer, String> room: rooms.entrySet()) {
            System.out.println(room);
        }
    }

    public void printDoctors() {
        address.printDocs();
    }

    public void printHospital() {
        System.out.println(hospitalName+", "+address.printAddress()+" "+rooms  + acceptedInsurances);
    }


}
