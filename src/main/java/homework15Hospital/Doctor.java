package homework15Hospital;

import java.util.List;
import java.util.Locale;

public class Doctor {
    private String name;
    private String LastName;
    private Position position;
    private List<Doctor> doctors;


    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        LastName = lastName;
        this.position = position;
        this.doctors = doctors;
    }

    public String printDoctor() {
        return position+" - "+name + " " + " " + LastName;
    }
    @Override
    public String toString() {
        return printDoctor();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public Position getPosition() {
        return position;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

//    public void printDocs() {
//        System.out.println(doctors.toString());
//
//    }
//    @Override
//    public String toString() {
//        return "Doctor " + name + " " + LastName + " - " + position.toString();
//    }

}
