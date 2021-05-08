package hw15vk77;


import java.util.*;

public class App {
    public static void main(String[] args) {
        /*
        Create class Hospital
Fields
- private String hospitalName;
- privare Address address;
    (Class Address
    - private String streetAddress;
    - private String town;
    - private String state;
    - private int zip;
- private List<Doctor> doctors;
    (Class Doctor
    - private String name;
    - private String lastName;
    - private Position position;
    (Enum Position is a enum with 5 members - for example Position.PHYSICIAN);
- private Map<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
- private List<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
    (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
Methods:
- Printout hospital with ALL fields
- Printout Doctors and their titles; public void printDoctors();
- Printout rooms
         */
        /////////////Start

        //Create Address class object
        Address address =new Address("4500 Parsons Blvd","Flushing","NY",11355);

        //Doctors
        Doctor doctor_D = new Doctor("Darshak","Shah",Position.MedicalDoctor);
        Doctor doctor_N = new Doctor("Noman ","Khan",Position.MedicalDoctor);
        List<Doctor> doctors= new ArrayList<>();
        doctors.add(doctor_D);
        doctors.add(doctor_N);

        //hospital rooms
        Map<Integer,String> rooms =new HashMap<>();
        rooms.put(1,"Emergency");
        rooms.put(2,"Laboratory");
        rooms.put(3,"EKG");
        rooms.put(4,"Ultrasound");
        rooms.put(5,"Urology");
        rooms.put(6,"Gastroenterology");
        rooms.put(7,"Restroom");

        //Insurance acceptable
        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.FidelisCare);
        acceptedInsuranses.add(InsuranseCompanies.UnitedHealthcare);
        acceptedInsuranses.add(InsuranseCompanies.AETNA);
        acceptedInsuranses.add(InsuranseCompanies.EmblemHealth);

        //Hospital
        Hospital flushingHospital = new Hospital("Flushing Hospital",address,doctors,rooms,acceptedInsuranses);

        //Methods - hospital with all fields
        System.out.println("====================================================");
        System.out.println("print all fields of class hospital:");
        System.out.println(flushingHospital.getHospitalName());
        System.out.println(flushingHospital.getAddress().getStreetAddress());
        System.out.println(flushingHospital.getAddress().getTown());
        System.out.println(flushingHospital.getAddress().getState());
        System.out.println(flushingHospital.getAddress().getZip());
        System.out.println("====================================================");
        System.out.println("print full address:");
        System.out.println(flushingHospital.getAddress().infoAddress());

        //print out Doctors and their titles
        System.out.println("====================================================");
        System.out.println("print out Doctors and their titles:");
        flushingHospital.getDoctors().get(0).printDoctors();
        flushingHospital.getDoctors().get(1).printDoctors();


        //Print out rooms
        System.out.println("====================================================");
        System.out.println("Print out rooms:");
        System.out.println("Hospital has rooms: "+flushingHospital.getRooms());
        System.out.println("Hospital accepts next list of insurance:");
        for  (InsuranseCompanies v:flushingHospital.getAcceptedInsuranses()){
            System.out.println(v);
        }
        System.out.println("====================================================");
        System.out.println("THE END!");









    }
}
