package UmidaLesson16HW;

import UmidaLesson15HW.Address;

import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private List<Agricultural> agricultural;

    public Farm(String name, Address address) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
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

    public List<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void setAgricultural(List<Agricultural> agricultural) {
        this.agricultural = agricultural;
    }

    public void printInfo() {}
}

