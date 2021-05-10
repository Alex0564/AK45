package hw16;

import java.util.*;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
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

    public Address getAddress() {
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

    public Set<Map.Entry<Cattle, Integer>> printOutCattle() {
        return cattle.entrySet();
    }

    public void  printInfo(){
        System.out.println("Farm name is "+name+"."+" The address is "+address.printAddress()+"."+printOutCattle()+agreeCultural);
    }
}
