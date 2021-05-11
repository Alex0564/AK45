package hw16;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<Agriculture> agriculture;

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

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<Agriculture> getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(List<Agriculture> agriculture) {
        this.agriculture = agriculture;
    }

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<Agriculture> agriculture) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriculture = agriculture;

    }

    private String print_cattle() {
        return cattle.toString();
    }

    @Override
    public String toString() {
        return "Farm information: " +
                "\nName: " + name +
                "\nFarm address: " + address.address_info() +
                "\nCattle: " + print_cattle() +
                "\nAgriculture: " + agriculture.toString();
    }
}



