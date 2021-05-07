package homework15;

import java.util.*;

public class Hospital {
        private String hospitalName = new String();
        private Address address = new Address();
        private Map<Integer, String> rooms = new HashMap<>();
        private List<InsuranseCompanies> acceptedInsurances = new ArrayList<>();
        private List<Doctor> doctors = new ArrayList<>();



        public Hospital() {
        }

        public Hospital(String hospitalName, Address address, Map<Integer, String> rooms, List<InsuranseCompanies> acceptedInsurances, List<Doctor> doctors) {
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

        public Map<Integer, String> getRooms() {
                return rooms;
        }

        public void setRooms(Map<Integer, String> rooms) {
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
}
