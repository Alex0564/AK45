package less15homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        List og rooms
        Map<Integer, String > rooms = new HashMap<>();
        List<InsuranceCompanies> acceptInsurances = new ArrayList<>() ;
        List<Doctor> doctors = new ArrayList<>();
        rooms.put(101, "Anesthesia");
        rooms.put(102, "Medicine");
        rooms.put(103, "Dermatology");
        rooms.put(104, "Surgery");
        rooms.put(106, "Pharmacy");
        rooms.put(107, "Otolaryngology");
        rooms.put(108, "Neurology");
        rooms.put(109, "Urology");
//        System.out.println(rooms);
//
////        List of Insurance Companies
        acceptInsurances.add(InsuranceCompanies.ANTHEM);
        acceptInsurances.add(InsuranceCompanies.HCSC);
        acceptInsurances.add(InsuranceCompanies.HHSC);
        acceptInsurances.add(InsuranceCompanies.OSCAR);
        acceptInsurances.add(InsuranceCompanies.FIDELIS);
//      System.out.println("Insurance Companies: " + acceptInsurances);

//      List of Address of Hospitals
        Address addressOfNYULH = new Address("150 55th Str", "Brooklyn", "NY", 11220 ); // NYU Langone Hospitals, New York City
        Address addressOfMayo = new Address("200 1st NW", "Rochester", "MN", 55901); // Mayo Clinic
        Address addressOfJHHB = new Address("1800 Orleans Street", "Baltimore", "MD", 21287); // Johns Hopkins Hospital, Baltimore
        Address addressOfMGHB = new Address("55 Fruit Str", "Boston", "MA", 02114); // Massachusetts General Hospital, Boston
        Address addressOfNMHC = new Address("251 E Huron St", "Chicago", "IL", 606116); // Northwestern Memorial Hospital, Chicago

//        List of Doctors
        Doctor maher = new Doctor ("Philip", "Maher", Position.DERMATOLOGIST);
        Doctor mitchel = new Doctor("Mitchel", "Dale", Position.NEUROLOGIST);
        Doctor ferrara = new Doctor("Ferrara", "Anthony", Position.OTOLARYNGOLOGIST);
        Doctor singh = new Doctor("Singh", "Joshua", Position.SURGEON);
        Doctor duran = new Doctor("Duran", "Hugo", Position.UROLOGIST);

//        List of Hospitals
//        Hospital nyulh = new Hospital("NYU Langone Hospitals", addressOfNYULH, doctors.add()  , 103, InsuranceCompanies.ANTHEM );



    }
}
