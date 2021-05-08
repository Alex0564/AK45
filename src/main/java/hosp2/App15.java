package hosp2;

import java.util.*;


public class App15 {
    public static void main(String[] args) {
        InsuranceCompanies1[] acceptedInsura = {InsuranceCompanies1.BERKLEY, InsuranceCompanies1.GLOBE_LIFE, InsuranceCompanies1.LOEWS, InsuranceCompanies1.MARKEL, InsuranceCompanies1.PRINCIPAL};
//        for (int i = 0; i < acceptedInsura.length; i++) {
//            System.out.println(acceptedInsura[i]);
//        }
        List<InsuranceCompanies1> acceptedInsurance1 = Arrays.asList(acceptedInsura);
        System.out.println(acceptedInsurance1);

        Doctor1 doc1 = new Doctor1("Tom", "Miller", Position1.CARDIOLOGIST);
        Doctor1 doc2 = new Doctor1("Rosa", "Petrova", Position1.OPHTHALMOLOGIST);
        Doctor1 doc3 = new Doctor1("Sam", "Khakimov", Position1.DERMATOLOGIST);
        Doctor1 doc4 = new Doctor1("Kimberli", "Ross", Position1.NEUROLOGIST);
        Doctor1 doc5 = new Doctor1("Gas", "Alvares", Position1.PHYSICIAN);

        doc1.printDoctor1();
        doc2.printDoctor1();
        doc3.printDoctor1();
        doc4.printDoctor1();
        doc5.printDoctor1();

        Doctor1[] doc = {doc1, doc2, doc3, doc4, doc5};
//        for (int i = 0; i < doc.length; i++) {
//            System.out.println(doc[i]);
//        }
        List<Doctor1> doctors1 = Arrays.asList(doc);
        System.out.println(doctors1);

        Map<Integer, Rooms1> rooms1 = new HashMap<>();
        Rooms1 cardiologyRoom1 = new Rooms1("Cardiology");
        Rooms1 ophthalmologyRoom1 = new Rooms1("Ophthalmology");
        Rooms1 dermatologyRoom1 = new Rooms1("Dermatology");
        Rooms1 neurologyRoom1 = new Rooms1("Neurology");
        Rooms1 physicianRoom1 = new Rooms1("Physician");
        rooms1.put(56, cardiologyRoom1);
        rooms1.put(87, ophthalmologyRoom1);
        rooms1.put(45, dermatologyRoom1);
        rooms1.put(23, neurologyRoom1);
        rooms1.put(11, physicianRoom1);
        System.out.println(rooms1);

        cardiologyRoom1.printRooms1();
        ophthalmologyRoom1.printRooms1();
        dermatologyRoom1.printRooms1();
        neurologyRoom1.printRooms1();
        physicianRoom1.printRooms1();


        Address1 addre1 = new Address1("5622 Duck Creek Dr", "Dallas", "TX", 75045);

        Hospital1 hospital2 = new Hospital1("Kindred Clinic", addre1, doctors1, rooms1, acceptedInsurance1);

        hospital2.printInfo();

    }
}
