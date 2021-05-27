package homework.homework16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCulturals;
    public void printInfo(){
        System.out.println(name+" located at");
        System.out.println(address);
        System.out.println("This farm has: ");
        for (Map.Entry<Cattle, Integer> entry: cattle.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        for (AgreeCultural a: agreeCulturals){
            a.printAgreeCulturals();
        }
    }

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<AgreeCultural> agreeCulturals) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCulturals = agreeCulturals;
    }


}
