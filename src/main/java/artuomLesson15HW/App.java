package artuomLesson15HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("=========================Rooms name=========================");
        Map<Integer, RoomsNames> rooms = new HashMap<>();// private Map<Integer,String> rooms;
        rooms.put(51, RoomsNames.CARDIOLOGICAL);
        rooms.put(52, RoomsNames.ALLERGY);
        rooms.put(53, RoomsNames.IMMUNOLOGICAL);
        rooms.put(54, RoomsNames.PULMONOLOGICAL);
        rooms.put(55, RoomsNames.SURGERY);
        rooms.put(56, RoomsNames.THERAPEUTIC);

        System.out.println(rooms.get(53));


        for (Integer key: rooms.keySet()){
            System.out.println(key);
        }
        for (RoomsNames value: rooms.values()){
            System.out.println(value);
        }
        for(Map.Entry<Integer,RoomsNames>entry:rooms.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


         System.out.println(rooms);




        System.out.println("================Create Doctors====================");
        List<Doctor> doctors = new ArrayList<>();
        Doctor gw = new Doctor("George", "Washington", Position.CARDIOLOGIST,RoomsNames.CARDIOLOGICAL);
        Doctor tj = new Doctor("Thomas ", "Jefferson", Position.ALLERGIST,RoomsNames.ALLERGY);
        Doctor al = new Doctor("Abraham", "Lincoln", Position.IMMUNOLOGISTS,RoomsNames.IMMUNOLOGICAL);
        Doctor ah = new Doctor("Alexander", "Hamilton", Position.PHYSICIAN,RoomsNames.IMMUNOLOGICAL);
        Doctor aj = new Doctor("Andrew", "Jackson", Position.PULMONOLOGIST,RoomsNames.PULMONOLOGICAL);
        Doctor hug = new Doctor(" Hiram ", "Grant", Position.SURGEON,RoomsNames.SURGERY);

        doctors.add(gw);
        doctors.add(tj);
        doctors.add(al);
        doctors.add(ah);
        doctors.add(aj);
        doctors.add((hug));



        System.out.println("====================First Way=====================");


        System.out.println(doctors.get(0));
        System.out.println(doctors.get(1));
        System.out.println(doctors.get(2));
        System.out.println(doctors.get(3));
        System.out.println(doctors.get(4));
        System.out.println(doctors.get(5));

        System.out.println("====================Second Way=====================");

        System.out.println(gw);
        System.out.println(tj);
        System.out.println(al);
        System.out.println(ah);
        System.out.println(aj);
        System.out.println(hug);


        gw.printDoctors();
        tj.printDoctors();
        al.printDoctors();
        ah.printDoctors();
        aj.printDoctors();
        hug.printDoctors();






        System.out.println("==========================Insurance======================");


        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.Anthem);
        acceptedInsuranses.add(InsuranseCompanies.CVS);
        acceptedInsuranses.add(InsuranseCompanies.Humana);
        acceptedInsuranses.add(InsuranseCompanies.KaiserFoundation);
        acceptedInsuranses.add(InsuranseCompanies.UnitedHealth);


        Address hosp = new Address("3201 Kings Hwy, Brooklyn ", "NYC", "NY", 11234);
        Hospital ms = new Hospital("Mount Sinai", hosp, doctors, acceptedInsuranses, rooms);


        System.out.println("=====================Printout hospital with ALL fields================================");
        System.out.println(ms.getHospitalName()+ms.getDoctors());
        System.out.println(ms.getHospitalName()+ms.getRooms());
        System.out.println(ms.getAcceptedInsuranses());
        System.out.println(ms.getAddress());

        System.out.println("=====================================Test======================================");

        System.out.println(ms.getHospitalName()+ms.getDoctors()+ms.getRooms()+ms.getAcceptedInsuranses()+ms.getAddress()+ms.getAddress().getZip()+ms.getAddress().getStreetAddress()+" "+ms.getAddress().getTown()+" "+ms.getAddress().getState());

// Скажите пожалуйста как можно строку 112 переносить чтоб не писать ее в строчку, Благодарю!
    }
}
