package UmidaLesson15HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SocketHandler;

public class App {

    public static void main(String[] args) {
        //address
        Address address = new Address("106OliviaSt","Orlando","FL",33045);

        //doctors
        Doctor drVazovski = new Doctor("Mike","Vazovski",Position.CARDIOLOGIST);
        Doctor drCondor = new Doctor("Liliana","Condor",Position.DENTIST);
        List<Doctor> docs = new ArrayList<>();
        docs.add(drVazovski);
        docs.add(drCondor);

        //rooms
        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(156,"Dentist");
        rooms.put(348,"Cardiologist");
        rooms.put(277,"Surgeon");
        rooms.put(369,"Pathologist");
        rooms.put(220,"Anestheologist");

        //insuranceCompanies
        List<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.FLORIDABLUE);
        acceptedInsurances.add(InsuranceCompanies.MEDICARE);
        acceptedInsurances.add(InsuranceCompanies.UNITEDHEALTHCARE);
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.BLUECROSS);

        //methods
//        - Printout hospital with ALL fields
//        - Printout Doctors and their titles; public void printDoctors();
//        - Printout rooms

        System.out.println("-Hospital Info:");
        Hospital hospital = new Hospital("StAnneChildren",address,docs,rooms,acceptedInsurances);
        System.out.println(hospital.getHospitalName());
        System.out.println(hospital.getAddress().getStreetAddress());
        System.out.println(hospital.getAddress().getTown());
        System.out.println(hospital.getAddress().getState());
        System.out.println(hospital.getAddress().getZip());

        System.out.println("---------------------");
        System.out.println("-Doctors Info:");
        hospital.getDoctors().get(0).printDoctors();
        hospital.getDoctors().get(1).printDoctors();

        System.out.println("----------------------");
        System.out.println("-Rooms Info:");
        for(Map.Entry<Integer,String>entry: rooms.entrySet())
        System.out.println(entry.getValue()+" room # is "+entry.getKey());

        System.out.println("---------------");
        System.out.println("the end");





    }
}
