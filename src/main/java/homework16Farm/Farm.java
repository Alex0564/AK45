package homework16Farm;

import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> heads;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> heads, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.heads = heads;
        this.agreeCultural = agreeCultural;
    }
    public String printInfo(){
        return name+" located at "+address.getAddress()+
                "\nMy list of animals: "+heads+
                "\nAnd I also grow: " +agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getHeads() {
        return heads;
    }

    public void setHeads(HashMap<Cattle, Integer> heads) {
        this.heads = heads;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }
}
