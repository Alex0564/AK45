package hosp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App14 {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital();
        hospital1.setHospitalName("Kindred Clinic");
        System.out.println(hospital1.getHospitalName());
        Address address1 = new Address("5622 Duck Creek Dr", "Dallas", "TX", 75045);
        System.out.println(address1.toString());
        hospital1.setAddress(address1);
        System.out.println(hospital1.getAddress());

        Doctor doctor1 = new Doctor("Tom", "Miller", Position.CARDIOLOGIST);
        Doctor doctor2 = new Doctor("Rosa", "Petrova", Position.OPHTHALMOLOGIST);
        Doctor doctor3 = new Doctor("Sam", "Khakimov", Position.DERMATOLOGIST);
        Doctor doctor4 = new Doctor("Kimberli", "Ross", Position.NEUROLOGIST);
        Doctor doctor5 = new Doctor("Gas", "Alvares", Position.PHYSICIAN);

        doctor1.printDoctors();
        doctor2.printDoctors();
        doctor3.printDoctors();
        doctor4.printDoctors();
        doctor5.printDoctors();

        List<Doctor> doctorList1 = new ArrayList<>();
        doctorList1.add(doctor1);
        doctorList1.add(doctor2);
        doctorList1.add(doctor3);
        doctorList1.add(doctor4);
        doctorList1.add(doctor5);
        System.out.println(doctorList1.toString());

        hospital1.setDoctors(doctorList1);
        System.out.println(hospital1.getDoctors());

        Map<Integer, Rooms> rooms = new HashMap<>();
        Rooms cardiologyRoom = new Rooms("Cardiology");
        Rooms ophthalmologyRoom = new Rooms("Ophthalmology");
        Rooms dermatologyRoom = new Rooms("Dermatology");
        Rooms neurologyRoom = new Rooms("Neurology");
        Rooms physicianRoom = new Rooms("Physician");
        rooms.put(56, cardiologyRoom);
        rooms.put(87, ophthalmologyRoom);
        rooms.put(45, dermatologyRoom);
        rooms.put(23, neurologyRoom);
        rooms.put(11, physicianRoom);
        System.out.println(rooms);

        hospital1.setRooms(rooms);
        System.out.println(rooms);

        List<InsuranсeCompanies> acceptedInsurance = new ArrayList<>();
        acceptedInsurance.add(InsuranсeCompanies.GLOBE_LIFE);
        acceptedInsurance.add(InsuranсeCompanies.BERKLEY);
        acceptedInsurance.add(InsuranсeCompanies.LOEWS);
        acceptedInsurance.add(InsuranсeCompanies.MARKEL);
        acceptedInsurance.add(InsuranсeCompanies.PRINCIPAL);
        System.out.println(acceptedInsurance);

        hospital1.setAcceptedInsuranсes(acceptedInsurance);
        System.out.println(acceptedInsurance);

        System.out.println(hospital1);

    }
}
