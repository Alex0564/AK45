package HW15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address address = new Address("550 1st Avenue", "New York", "NY", 10016);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Michael", "Lasak", Position.PHYSICAL_THERAPIST));
        doctors.add(new Doctor("Nathanael", "Horne", Position.ALLERGIST));
        doctors.add(new Doctor("Michael", "Alaia", Position.ORTHOPEDIC));
        doctors.add(new Doctor("Thomas", "Spears", Position.UROLOGIST));
        doctors.add(new Doctor("Jennifer", "Chao", Position.CARDIOLOGIST));


        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Physical Therapy");
        rooms.put(102, "Allergy Medicine");
        rooms.put(103, "Orthopedy");
        rooms.put(104, "Urology");
        rooms.put(105, "Cardiology");


        List<InsuranceCompanies> acceptedInsurance =new ArrayList<>();
        acceptedInsurance.add(InsuranceCompanies.UNITED_HEALTH_CARE);
        acceptedInsurance.add(InsuranceCompanies.FIDELIS);
        acceptedInsurance.add(InsuranceCompanies.OSCAR);
        acceptedInsurance.add(InsuranceCompanies.METRO_PLUS_HEALTH_PLAN);
        acceptedInsurance.add(InsuranceCompanies.MVP_HEALTH_PLAN);

        Hospital nyuLangone = new Hospital("NYU Langone Health", address, doctors, rooms, acceptedInsurance);

        System.out.println(nyuLangone.getHospitalName()+"\n"+address.addressInfo());

        for (Doctor d:doctors){
            System.out.println(d.printDoctor());
        }
        for (Map.Entry<Integer,String> r: rooms.entrySet()){
            System.out.println("Room # "+r);
        }

            }
        }




