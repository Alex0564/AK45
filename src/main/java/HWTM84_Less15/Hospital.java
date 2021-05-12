package HWTM84_Less15;

import TMLess11.Address;

public class Hospital {
    private String hospitalName;

    private Address address;

    public Hospital(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
