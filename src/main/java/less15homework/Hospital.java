package less15homework;

import java.lang.ref.PhantomReference;
import java.util.*;

public class Hospital {
   private String hospitalName;
   private Address address;
   private List<Doctors> doctors;
   private Map<Integer, String > rooms;
   private List<InsuranceCompanies> acceptedInsurances;

   public Hospital() { }

   public Hospital(String hospitalName, Address address,
                   List<Doctors> doctors, Map<Integer, String>
           rooms, List<InsuranceCompanies> acceptedInsurances) {
      this.hospitalName = hospitalName;
      this.address = address;
      this.doctors = doctors;
      this.rooms = rooms;
      this.acceptedInsurances = acceptedInsurances;
   }

   public String getHospitalName() {return hospitalName;}

   public void setHospitalName(String hospitalName) {
      this.hospitalName = hospitalName;}

   public Address getAddress() {return address;}

   public void setAddress(Address address) {this.address = address;}

   public List<Doctors> getDoctors() {return doctors;}

   public void setDoctors(List<Doctors> doctors) {this.doctors = doctors;}

   public Map<Integer, String> getRooms() {return rooms;}

   public void setRooms(Map<Integer, String> rooms) {this.rooms = rooms;}

   public List<InsuranceCompanies> getAcceptedInsurances() {
      return acceptedInsurances;}

   public void setAcceptedInsurances(List<InsuranceCompanies> acceptedInsurances) {
      this.acceptedInsurances = acceptedInsurances;}

   @Override
   public String toString() {
      return "Hospital{" +
              "hospitalName='" + hospitalName + '\'' +
              ", address=" + address +
              ", doctors=" + doctors +
              ", rooms=" + rooms +
              ", acceptedInsurances=" + acceptedInsurances +
              '}';
   }

}
