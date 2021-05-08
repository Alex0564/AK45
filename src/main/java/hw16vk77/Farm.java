package hw16vk77;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle; //Cattle - type of animal, Integer - amount of animal of each kind
    private List<AgriCultural> agriCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<AgriCultural> agriCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultural = agriCultural;
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

    public List<AgriCultural> getAgriCultural() {
        return agriCultural;
    }

    public void setAgreeCultural(List<AgriCultural> agriCultural) {
        this.agriCultural = agriCultural;
    }

    //this method formatting cattle list result
    public String getListOfCattle(){
        String result="\n[amount][cattle]";

         for (Map.Entry<Cattle,Integer> entry:cattle.entrySet()){
            result+=("\n"+entry.getValue()+"\t\t"+entry.getKey());}
            return result;
        }

        //this method formatting agriculters result - invoke method getAgriculture()  from AgriCultural class
    public String getListOfAgricults(){
        String res ="\n[f#][name]";

        for (AgriCultural v:agriCultural){
            res+= "\n"+v.getAgriculture();
        }
        return res;
    }

    public void printInfo()// print out all info
    {


        System.out.println("[Farm Info] print result "+
                "\n--------=========----------"+
                "\nFarm name: "+this.name+
                "\n--------=========----------"+
                "\naddress: "+address.getAddress() +
                "\n--------=========----------"+
                "\nCattle: "+getListOfCattle()+
                "\n--------=========----------"+
                "\nAgricultures: "+  getListOfAgricults()+
                "\n---------THE END----------");



    }
}
