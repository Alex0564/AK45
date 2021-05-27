package homework.homework15;

import java.util.*;

public class Hospital {
        private String hospitalName;
        private Address address;
        private Map<Integer, Position> rooms;
        private List<InsuranseCompanies> acceptedInsurances;
        private List<Doctor> doctors;


        public Hospital(String hospitalName, Address address, Map<Integer, Position> rooms, List<InsuranseCompanies> acceptedInsurances, List<Doctor> doctors) {
                this.hospitalName = hospitalName;
                this.address = address;
                this.rooms = rooms;
                this.acceptedInsurances = acceptedInsurances;
                this.doctors = doctors;
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

        public Map<Integer, Position> getRooms() {
                return rooms;
        }

        public void setRooms(Map<Integer, Position> rooms) {
                this.rooms = rooms;
        }

        public List<InsuranseCompanies> getAcceptedInsurances() {
                return acceptedInsurances;
        }

        public void setAcceptedInsurances(List<InsuranseCompanies> acceptedInsurances) {
                this.acceptedInsurances = acceptedInsurances;
        }

        public List<Doctor> getDoctors() {
                return doctors;
        }

        public void setDoctors(List<Doctor> doctors) {
                this.doctors = doctors;
        }

        public  void printInfo(){
                System.out.println(hospitalName);
                System.out.println(address.toString());
                System.out.println("Doctors:");
                for (Doctor d: doctors){
                        System.out.println(d);
                }
                System.out.println("Rooms:");
                for (Map.Entry<Integer,Position> entry: rooms.entrySet()){
                        System.out.println(entry.getKey()+" - "+entry.getValue());
                }
                System.out.println("Accepted insurances:");
                for (InsuranseCompanies i: acceptedInsurances){
                        System.out.println(i);
                }
        }
}
