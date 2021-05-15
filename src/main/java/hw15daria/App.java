package hw15daria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main (String []args){
    Address address = new Address("9401 Turkey Lake RD", "Orlando", "FL", 32819);
    Doctor Luis = new Doctor("Luis", "Garcia", Position.DENTIST);
    Doctor Holly = new Doctor("Holly", "Lapka", Position.EYE_DOCTOR);
    Doctor Thomas = new Doctor("Thomas", "Todd", Position.ALLERGIST);
    Doctor Megan = new Doctor ("Megan", "Hunt", Position.DERMATOLOGIST);
    Doctor Mayre = new Doctor("Mayra", "George", Position.PHYSICIAN);

    List<Doctor> doctorArrayList = new ArrayList<>();
    doctorArrayList.add(Luis);
    doctorArrayList.add(Holly);
    doctorArrayList.add(Thomas);
    doctorArrayList.add(Megan);
    doctorArrayList.add(Mayre);

    Map<Integer, String> rooms =new HashMap<>();
    rooms.put(0, "Allergist's Room");
    rooms.put(1, "Ophtalmoligist's Room");
    rooms.put(2, "Dermatologist's Room");
    rooms.put(3, "Physician's Room");


    List<InsuranseCompany> InsuranseComps = new ArrayList<>();
    InsuranseComps.add(InsuranseCompany.AETHNA);
    InsuranseComps.add(InsuranseCompany.BLUE_CROSS);
    InsuranseComps.add(InsuranseCompany.CIGNA);
    InsuranseComps.add(InsuranseCompany.KAISER);
    InsuranseComps.add(InsuranseCompany.MEDICAID);

    Hospital hospital = new Hospital("Orlando Health", address, doctorArrayList, rooms, InsuranseComps);
    hospital.printHospital();

    }
}
