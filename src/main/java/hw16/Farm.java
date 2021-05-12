package hw16;



import java.util.List;
import java.util.Map;

public class Farm {
        private String name;
        private Address address;
        private Map<Cattle, Integer> cattle;
        private List<AgreeCulture> agreeCultures;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCulture> agreeCultures){

        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultures = agreeCultures;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public List<AgreeCulture> getAgreeCultures() {
        return agreeCultures;
    }

    public String printInfoFarm(){
        return name +"\n"+"Address: "+ address +"\n"+cattle+"\n"+agreeCultures;
    }
}

