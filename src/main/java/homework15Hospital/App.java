package homework15Hospital;

import hm11a.Monitor;
import homework14.Student;
import homework14.Subject;
import org.w3c.dom.ls.LSOutput;

import javax.print.Doc;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Address addressA = new Address(" 353 Wooster st.", "Los Angeles", "CA", 90035);

        Doctor ivanov = new Doctor("Ivan", "Kovalev", Position.CARDIOLOGIST);
        Doctor petrov = new Doctor("Oleg", "Petrov", Position.SURGEON);
        Doctor sidorov = new Doctor("Il'ya", "Sidorov", Position.DERMATOLOGIST);
        Doctor titova = new Doctor("Anna", "Titova", Position.PHYSICIAN);
        Doctor kotova = new Doctor("Svetlana", "Kotova", Position.ENDOCRINOLOGIST);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(ivanov);
        doctors.add(petrov);
        doctors.add(sidorov);
        doctors.add(titova);
        doctors.add(kotova);

        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(224, "Gastroenterology");
        rooms.put(324, "Surgery");
        rooms.put(226, "Dermatology");
        rooms.put(228, "Endocrinology");
        rooms.put(114, "Comsultation");

        List<InsuranseCompamies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompamies.ANTHEM);
        acceptedInsuranses.add(InsuranseCompamies.HCSC);
        acceptedInsuranses.add(InsuranseCompamies.HUMANA);
        acceptedInsuranses.add(InsuranseCompamies.KAISER);
        acceptedInsuranses.add(InsuranseCompamies.UNITEDHEALTH);

        Hospital saintMartin = new Hospital("Saint Martin", addressA, doctors, rooms, acceptedInsuranses);

        System.out.println(saintMartin.printInfo());

//        System.out.println(saintMartin.getDoctors());

        System.out.println("Rooms info: "+saintMartin.getRooms());




        }



    }


