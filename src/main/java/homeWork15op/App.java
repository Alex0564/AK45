package homeWork15op;

import javax.swing.text.Position;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("James", "O'Nill", DoctorPosition.ENDOCRINOLOGIST);
        Doctor doctor2 = new Doctor("David", "Rassel",DoctorPosition.CARDIOLOGIST);
        Doctor doctor3 = new Doctor("Elizabet", "Swong",DoctorPosition.NURSE);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        HashMap<Integer,String> rooms = new HashMap<>();
            rooms.put(101,"Reception");
            rooms.put(102,"main Lobby");
            rooms.put(103,"Admitting office");
            rooms.put(104,"Office of the Chief of Hospital");
            rooms.put(105,"Office of the Chief Nurse");
            rooms.put(201,"Operating");
            rooms.put(202,"Recovery");
            rooms.put(203,"X-ray");
            rooms.put(205,"Medical Records");

            List<InsuranceCompanies> acceptedInsurance = new ArrayList<>();
            acceptedInsurance.add(InsuranceCompanies.AETNA);
            acceptedInsurance.add(InsuranceCompanies.AMERIHEALTH);
            acceptedInsurance.add(InsuranceCompanies.BLUE_CROSS);
            acceptedInsurance.add(InsuranceCompanies.TUFTS);


           Address address = new Address("3300 Main st", "Springfield", "MA", "01107");
           Hospital baystate = new Hospital("Baystate", address,doctors, rooms,acceptedInsurance);

        System.out.println(baystate);
        System.out.println(rooms);
        }
    }

