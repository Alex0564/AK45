package HW16;

import HW15.Address;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
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

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void getFarmInfo() {
        System.out.println(name +"\n"+ address.addressInfo());
        for (AgreeCultural ac : agreeCultural) {
            System.out.println(ac.printAgreeCultural());
        }
            for (Map.Entry<Cattle, Integer> ct : cattle.entrySet()) {
                System.out.println(ct);

            }
        }
    }








