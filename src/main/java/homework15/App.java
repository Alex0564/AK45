package homework15;

public class App {
    public static void main(String[] args) {
        Hospital elizabeth = new Hospital();
        elizabeth.setHospitalName("St. Elizabeth's Medical Center");
        elizabeth.getAddress().setStreetAddress("736 Cambridge St");
        elizabeth.getAddress().setTown("Brighton");
        elizabeth.getAddress().setState("MA");
        elizabeth.getAddress().setZip("02135");
        Doctor doctorJohnGarrison = new Doctor("John","Garrison",Position.CARDIOLOGIST);
        Doctor doctorSophiePeli = new Doctor("Sophie","Peli",Position.GASTROENTEROLOGIST);
        elizabeth.getDoctors().add(0,doctorJohnGarrison);
        elizabeth.getDoctors().add(1,doctorSophiePeli);
        elizabeth.getAcceptedInsurances().add(0,InsuranseCompanies.CVS);
        elizabeth.getAcceptedInsurances().add(1,InsuranseCompanies.METROPOLITAN);
        elizabeth.getAcceptedInsurances().add(2,InsuranseCompanies.CARESOURCE);
        elizabeth.getRooms().put(31,"Cardiology");
        elizabeth.getRooms().put(54,"Gastroenterology");

        System.out.println(elizabeth.getHospitalName()+" located on "+elizabeth.getAddress().getStreetAddress()+", "+elizabeth.getAddress().getTown()+", "+elizabeth.getAddress().getState()+" "+elizabeth.getAddress().getZip());
        System.out.println("Doctors:");
        elizabeth.getDoctors().get(0).printDoctor();
        elizabeth.getDoctors().get(1).printDoctor();
        System.out.println("Accepted insurances:");
        System.out.println(elizabeth.getAcceptedInsurances().get(0)+"\n"+elizabeth.getAcceptedInsurances().get(1)+"\n"+elizabeth.getAcceptedInsurances().get(2));
        System.out.println("Rooms:\n"+elizabeth.getRooms());
    }
}
