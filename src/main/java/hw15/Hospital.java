package hw15;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital (String hospitalName,Address address){
        this.hospitalName = hospitalName;
        this.address = address;
        }
     public String getHospitalName (String hospitalName){
        return hospitalName;
     }

    @Override
    public String toString() {
        return  hospitalName + " Hospital "+"\n" + address+".";
    }

//    public void printInfoHospitals(String printInfoHospitals){
//        System.out.println(hospitalName+"\n"+address);
//     }

}
