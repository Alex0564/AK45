package homework15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("736 Cambridge st","Brighton","MA","02135");
        Doctor doctorJohnGarrison = new Doctor("John","Garrison",Position.CARDIOLOGIST);
        Doctor doctorSophiePeli = new Doctor("Sophie","Peli",Position.GASTROENTEROLOGIST);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctorJohnGarrison);
        doctors.add(doctorSophiePeli);
        List<InsuranseCompanies> insuranseCompanies = new ArrayList<>();
        insuranseCompanies.add(InsuranseCompanies.CVS);
        insuranseCompanies.add(InsuranseCompanies.METROPOLITAN);
        insuranseCompanies.add(InsuranseCompanies.CARESOURCE);
        Map<Integer,Position> rooms = new HashMap<>();
        rooms.put(31,Position.GASTROENTEROLOGIST);
        rooms.put(54,Position.CARDIOLOGIST);
        Hospital elizabeth = new Hospital("St. Elizabeth's Medical Center",address,rooms,insuranseCompanies,doctors);
        elizabeth.printInfo();


    }
}
