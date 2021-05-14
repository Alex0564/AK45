package less15homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Integer, String > rooms = new HashMap<>();
        List<InsuranceCompanies> acceptInsurances = new ArrayList<>() ;
        List<Doctor> doctors = new ArrayList<>();

//                List of rooms
        rooms.put(101, "Anesthesia");
        rooms.put(102, "Medicine");
        rooms.put(103, "Dermatology");
        rooms.put(104, "Surgery");
        rooms.put(106, "Pharmacy");
        rooms.put(107, "Otolaryngology");
        rooms.put(108, "Neurology");
        rooms.put(109, "Urology");

        //        List of Insurance Companies
        acceptInsurances.add(InsuranceCompanies.ANTHEM);
        acceptInsurances.add(InsuranceCompanies.HCSC);
        acceptInsurances.add(InsuranceCompanies.HHSC);
        acceptInsurances.add(InsuranceCompanies.OSCAR);
        acceptInsurances.add(InsuranceCompanies.FIDELIS);


//      List of Address of Hospitals
        Address addressOfNYULH = new Address("150 55th Str", "Brooklyn", "NY", 11220 ); // NYU Langone Hospitals, New York City
        Address addressOfMayo = new Address("200 1st NW", "Rochester", "MN", 55901); // Mayo Clinic
        Address addressOfJHHB = new Address("1800 Orleans Street", "Baltimore", "MD", 21287); // Johns Hopkins Hospital, Baltimore
        Address addressOfMGHB = new Address("55 Fruit Str", "Boston", "MA", 2114); // Massachusetts General Hospital, Boston
        Address addressOfNMHC = new Address("251 E Huron St", "Chicago", "IL", 606116); // Northwestern Memorial Hospital, Chicago

//        List of Doctors
        Doctor maher = new Doctor ("Philip", "Maher", Position.DERMATOLOGIST);
        Doctor mitchel = new Doctor("Mitchel", "Dale", Position.NEUROLOGIST);
        Doctor ferrara = new Doctor("Ferrara", "Anthony", Position.OTOLARYNGOLOGIST);
        Doctor singh = new Doctor("Singh", "Joshua", Position.SURGEON);
        Doctor duran = new Doctor("Duran", "Hugo", Position.UROLOGIST);

        doctors.add(maher);
        doctors.add(mitchel);
        doctors.add(ferrara);
        doctors.add(singh);
        doctors.add(duran);



//        List of Hospitals
        Hospital nyulh = new Hospital("NYU Langone Hospital",
        addressOfNYULH, doctors , rooms, acceptInsurances );
        System.out.println(nyulh);

        System.out.println("\nList of Doctors:\n"+doctors+"\n");

        maher.printDoctors();
        duran.printDoctors();
        singh.printDoctors();

        System.out.println("\nList of rooms: "+rooms);

        System.out.println("\nInsurance Companies: " + acceptInsurances);





    }
}
