package hw15daria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main (String []args){
    Address adr = new Address("9401 Turkey Lake RD", "Orlando", "FL", 32819);
    Doctor Luis = new Doctor("Luis", "Garcia", Position.position.DENTIST);
    Doctor Holly = new Doctor("Holly", "Lapka", Position.position.EYE_DOCTOR);
    Doctor Thomas = new Doctor("Thomas", "Todd", Position.position.ALLERGIST);
    Doctor Megan = new Doctor ("Megan", "Hunt", Position.position.DERMATOLOGIST);
    Doctor Mayre = new Doctor("Mayra", "George", Position.position.PHYSICIAN);

    List<Doctor> docs = new ArrayList<>();
    docs.add(Luis);
    docs.add(Holly);
    docs.add(Thomas);
    docs.add(Megan);
    docs.add(Mayre);
//    for (Doctor d: docs){ System.out.println(docs); }

    Map<Integer, String> rooms =new HashMap<>();
    rooms.put(0, "Allergist's Room");
    rooms.put(1, "Ophtalmoligist's Room");
    rooms.put(2, "Dermatologist's Room");
    rooms.put(3, "Physician's Room");


    List<InsuranseCompamies.InsuranseComp> insur = new ArrayList<>();
    insur.add(InsuranseCompamies.InsuranseComp.AETHNA);
    insur.add(InsuranseCompamies.InsuranseComp.BLUE_CROSS);
    insur.add(InsuranseCompamies.InsuranseComp.CIGNA);
    insur.add(InsuranseCompamies.InsuranseComp.KAISER);
    insur.add(InsuranseCompamies.InsuranseComp.MEDICAID);

    Hospital orl = new Hospital();


    }
}
