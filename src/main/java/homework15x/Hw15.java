package homework15x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw15 {

    public static void main(String[] args) {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("James", "Abrams",Position.PSYCHIATRIST));
        doctors.add(new Doctor("Emily", "Olsen",Position.CARDIOLOGIST));
        doctors.add(new Doctor("Anisah","Lowery",Position.DERMATOLOGIST));
        doctors.add(new Doctor("Orlando", "Nash",Position.PHYSICIAN));
        doctors.add(new Doctor("Horace","Rosario",Position.PEDIATRICIAN));

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(7, "Physician");
        rooms.put(8, "Dermatologist");
        rooms.put(9, "Cardiologist");
        rooms.put(10, "Psychiatrist");
        rooms.put(11, "Pediatrician");

        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();

        Address address = new Address("102-01 66th Rd","Long Island","NY",11375);
        Hospital newHospital = new Hospital("Notrthwell Health",address);
        newHospital.printInfo();

        System.out.println("\n" + "Doctors and their Titles:");
        for (int i=0;i<doctors.size();i++){
            System.out.println( doctors.get(i));
        }

        System.out.println("\n"+"Rooms:");
        for (Map.Entry<Integer,String> entry: rooms.entrySet()){
            System.out.println(entry);

        }
    }

}
