package HW15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address address = new Address("550 1st Avenue", "New York", "NY", 10016);
        Hospital nyuLangone = new Hospital("NYU Langone Health", address);
        System.out.println(nyuLangone.getHospitalName());
        System.out.println(address.addressInfo());


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Michael", "Lasak", Position.PHYSICAL_THERAPIST));
        doctors.add(new Doctor("Nathanael", "Horne", Position.ALLERGIST));
        doctors.add(new Doctor("Michael", "Alaia", Position.ORTHOPEDIC));
        doctors.add(new Doctor("Thomas", "Spears", Position.UROLOGIST));
        doctors.add(new Doctor("Jennifer", "Chao", Position.CARDIOLOGIST));
        for (Doctor d:doctors){
            d.getDoctors();
        }

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Physical Therapy");
        rooms.put(102, "Allergy Medicine");
        rooms.put(103, "Orthopedy");
        rooms.put(104, "Urology");
        rooms.put(105, "Cardiology");
        for (Map.Entry<Integer,String> room: rooms.entrySet()){
            System.out.println("Room "+room);
        }

        List<InsuranceCompanies> acceptedInsurance =new ArrayList<>();
        acceptedInsurance.add(InsuranceCompanies.UNITED_HEALTH_CARE);
        acceptedInsurance.add(InsuranceCompanies.FIDELIS);
        acceptedInsurance.add(InsuranceCompanies.OSCAR);
        acceptedInsurance.add(InsuranceCompanies.METRO_PLUS_HEALTH_PLAN);
        acceptedInsurance.add(InsuranceCompanies.MVP_HEALTH_PLAN);

        }
    }

