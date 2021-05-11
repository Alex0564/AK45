package homework16x;

public class Farm {
    private String name;
    private Address address;

    public Farm(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void printInfo(){
        System.out.println("Info about Farm:"+"\n"+name+" "+address);
    }
}
