package less15homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String > rooms = new HashMap<>();
        List<InsuranceCompanies> acceptInsurances = new ArrayList<>() ;
        rooms.put(101, "Anesthesia");
        rooms.put(102, "Medicine");
        rooms.put(103, "Dermatology");
        rooms.put(104, "Surgery");
        rooms.put(106, "Pharmacy");
        rooms.put(107, "Otolaryngology");
        rooms.put(108, "Neurology");
        rooms.put(109, "Surgery");
        rooms.put(110, "Urology");
        System.out.println(rooms);
        acceptInsurances.add(InsuranceCompanies.ANTHEM);
        acceptInsurances.add(InsuranceCompanies.HCSC);
        acceptInsurances.add(InsuranceCompanies.HCSC);
        acceptInsurances.add(InsuranceCompanies.OSCAR);
        acceptInsurances.add(InsuranceCompanies.FIDELIS);
        System.out.println("Insurance Companies: " + acceptInsurances);
    }
}
