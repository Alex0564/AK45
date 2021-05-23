package UmidaLesson16HW;

import UmidaLesson15HW.Address;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private List<Agriculture> agriculture;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<Agriculture> agriculture) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriculture = agriculture;
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

    public List<Agriculture> getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(List<Agriculture> agriculture) {
        this.agriculture = agriculture;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAddress: " + address +
                "\nCattle: " + cattle +
                "\nAgriculture: " + agriculture;
    }
}
