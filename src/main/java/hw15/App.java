package hw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        /*
          Homework for Lesson 15 Exceptions

          Create class Hospital
          Fields:
        - private String hospitalName;
        - private Address address;
             Class Address:
             - private String streetAddress;
             - private String city;
             - private String state;
             - private int zip;
        - private List<Doctor> doctors;
             Class Doctor:
             - private String name;
             - private String lastName;
             - private Position position; (Enum Position is a enum with
                5 members - for example Position.PHYSICIAN);
        - private Map<Integer,String> rooms;
        (list of rooms and their names - for example,
        room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
        - private List<InsuranceCompanies> acceptedInsurances; list of accepted insurance.
        (Enum InsuranceCompanies - enum of Insurances -  for example,
        InsuranceCompanies.AETNA, InsuranceCompanies.UnitedHealthcare)

        Methods:
        - Printout hospital with ALL fields;
        - Printout Doctors and their titles; public void printDoctors();
        - Printout rooms;

        */

        Address hospitalAddress = new Address("1 Main street", "Saint Louis", "Missouri", 100023);

        //Array list Doctor
        List<Doctor> doctorList = new ArrayList<Doctor>();
        Doctor john = new Doctor("John", "Watson", Position.PHYSICIAN);
        Doctor sarah = new Doctor("Sarah", "Wilson", Position.PSYCHIATRIST);
        Doctor brad = new Doctor("Brad", "Thomson", Position.CARDIOLOGIST);
        Doctor william = new Doctor("William", "Adams", Position.DERMATOLOGIST);
        doctorList.add(john);
        doctorList.add(sarah);
        doctorList.add(brad);
        doctorList.add(william);

        //Map Rooms

        Map<Integer, String> rooms = new HashMap<Integer, String>();
        rooms.put(101, "Dermatology room");
        rooms.put(204, "Psychiatrist room");
        rooms.put(306, "Pediatrician room");
        rooms.put(105, "Physician room");
        rooms.put(218, "Cardiologist room");

        //Array list of accepted insurances

        List<InsuranceCompanies> insuranceCompanies = new ArrayList<InsuranceCompanies>();
        insuranceCompanies.add(InsuranceCompanies.AETNA);
        insuranceCompanies.add(InsuranceCompanies.ANTHEM);
        insuranceCompanies.add(InsuranceCompanies.HUMANA);
        insuranceCompanies.add(InsuranceCompanies.CIGNA_HEALTH);
        insuranceCompanies.add(InsuranceCompanies.UNITED_HEALTH);

        Hospital mercy = new Hospital("Mercy", hospitalAddress, doctorList, rooms, insuranceCompanies);

        // Printout hospital with All fields

        System.out.println();

        System.out.println("Hospital name: " + mercy.getHospitalName() + "\nHospital address: " +
                mercy.getAddress().getStreetAddress() + ", " + mercy.getAddress().getCity() + ", " +
                mercy.getAddress().getState() + ", " + mercy.getAddress().getZip() +
                "\nDoctor's list: " + "\n" + mercy.getDoctorList().get(0).getName() + " "
                + mercy.getDoctorList().get(0).getLastName() + ": " + mercy.getDoctorList().get(0).getPosition()
                + ", " + mercy.getDoctorList().get(1).getName() + " " + mercy.getDoctorList().get(1).getLastName()
                + ": " + mercy.getDoctorList().get(1).getPosition() + ", " + mercy.getDoctorList().get(2).getName()
                + " " + mercy.getDoctorList().get(2).getLastName() + ": " + mercy.getDoctorList().get(2).getPosition()
                + ", " + mercy.getDoctorList().get(3).getName() + " " + mercy.getDoctorList().get(3).getLastName()
                + ": " + mercy.getDoctorList().get(3).getPosition() + "\nRooms: " + mercy.getRooms()
                + "\nAccepted Insurance companies: " + mercy.getAcceptedInsurances());

        //printout Doctors and their titles

        System.out.println("***********************************************************************************");
        System.out.println("Doctors and their titles:");
        for (Doctor element : doctorList) {
            System.out.println(element.getName() + " " + element.getLastName() + " is a "
                    + element.getPosition());
        }
        System.out.println("************************************");

        //public void printDoctorsInfo

        sarah.printDoctorsInfo();
        john.printDoctorsInfo();
        william.printDoctorsInfo();
        brad.printDoctorsInfo();
        System.out.println("************************************");

        //printout rooms

        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println(entry.getValue() + " - #" + entry.getKey());

        }

    }
}
