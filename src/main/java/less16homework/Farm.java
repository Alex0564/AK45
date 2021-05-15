package less16homework;

import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address,
                HashMap<Cattle, Integer> cattle,
                List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress(Address addressOffarm) {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    @Override
    public String toString() {
        return "Print farm with toString: '" + name + '\'' +
                ", \naddress=" + address +
                ", \ncattle=" + cattle +
                ", \nagreeCultural=\n" + agreeCultural;
    }
    public void printInfo(){
        System.out.println("\nPrint farm with printInfo:\nName of farm: "+ name + "\nAddress: "+address+ "\nNumber of cattles:\n "+
                 cattle+ "\nNumber of agreecultures:\n "+ agreeCultural);
    }

}
