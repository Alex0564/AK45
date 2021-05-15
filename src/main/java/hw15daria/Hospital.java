package hw15daria;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranseCompamies> acceptedInsuranses;

// full constructor for Hospital
    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompamies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }
// getters
    public Address getAddress () { return address; }
    public List<Doctor> getDocrots () {return doctors;}
    public Map<Integer, String> getRooms () {return rooms;}
    public List<InsuranseCompamies> getAcceptedInsuranses() { return acceptedInsuranses; }

    // setters
    public void setHospitalName (String hospitalName){ this.hospitalName = hospitalName; }
    public void setAddress (Address address){ this.address = address; }
    public void setDoctors(List<Doctor> doctors) { this.doctors = doctors; }
    public void setRooms(Map<Integer, String> rooms) { this.rooms = rooms; }
    public void setAcceptedInsuranses(List<InsuranseCompamies> acceptedInsuranses) { this.acceptedInsuranses = acceptedInsuranses; }

// print info

    public void print_doctors (){
        for (Doctor d: doctors){
            System.out.println(d.printDoctors());
        }
    }

    public void print_Insurance (){
        for (InsuranseCompamies i: acceptedInsuranses){
            System.out.println (i);
        }
    }

    public void print_Rooms(){
        for (Map.Entry<Integer, String> pairKeyValue: rooms.entrySet()){
            System.out.println("The"+pairKeyValue+" "+pairKeyValue.getValue()+".");
        }
    }


    public void printHospital(){
        System.out.println("The name of the hospital is: "+ hospitalName+
                "and the Address is: "+address+"\nThe list of the doctors is: ");
        print_doctors();
        System.out.println("\nAnd accepted insurances are: ");
        print_Insurance();
        System.out.println("\nThe rooms are: ");
        print_Rooms();
    }


}
