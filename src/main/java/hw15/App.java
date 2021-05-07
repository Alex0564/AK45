package hw15;
//        Create class Hospital
//        Fields
//        - private String hospitalName;
//        - privare Address address;
//        (Class Address
//        - private String streetAddress;
//        - private String town;
//        - private String state;
//        - private int zip;
//        - private List<Doctor> doctors;
//        (Class Doctor
//        - private String name;
//        - private String lastName;
//        - private Position position;
//        (Enum Position is a enum with 5 members - for example Position.PHYSICIAN);
//        - private Map<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//        - private List<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
//        (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Methods:
//        - Printout hospital with ALL fields
//        - Printout Doctors and their titles; public void printDoctors();
//        - Printout rooms

import java.util.*;

public class App {

    public static void main(String[] args) {


        Doctor john = new Doctor("John", "House", Position.PHYSICIAN);
        Doctor kate = new Doctor("Kate", "Miller", Position.DERMATOLOGIST);
        Doctor lee = new Doctor("Lee", "Chaw", Position.SURGEON);
        Doctor bob = new Doctor("Bob", "Rose", Position.CARDIOLOGIST);
        Doctor james = new Doctor("James", "Newman", Position.PEDIATRICIAN);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(john);
        doctors.add(kate);
        doctors.add(lee);
        doctors.add(bob);
        doctors.add(james);

        Address address = new Address("4650 W Sunset Blvd", "Los Angeles", "CA", 90027, doctors);
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Dermatology");
        rooms.put(25, "Surgery");
        rooms.put(23, "Nursery");
        rooms.put(30,"Cardiology");
        rooms.put(1, "Pediatric");

        List<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.CVS);
        acceptedInsurances.add(InsuranceCompanies.HCSC);


        Hospital hospital = new Hospital("Children Hospital", address, rooms, acceptedInsurances);


//        System.out.println(address.printAddress());
        hospital.printHospital();

        hospital.printDoctors();
        hospital.printRooms();




        }
}
