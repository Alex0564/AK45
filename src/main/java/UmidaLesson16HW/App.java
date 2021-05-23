package UmidaLesson16HW;

import UmidaLesson15HW.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args){
        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEYS, 35);
        cattle.put(Cattle.CHICKENS, 58);
        cattle.put(Cattle.COWS, 45);
        cattle.put(Cattle.SHEEPS, 22);
        cattle.put(Cattle.PIGS, 10);

        List<Agriculture> agricultureList = new ArrayList<>();
        Agriculture agricultureWheet = new Agriculture("wheet", 5);
        Agriculture agricultureSoy = new Agriculture("soy", 6);
        Agriculture agriculturePea = new Agriculture("pea", 7);
        agricultureList.add(0, agriculturePea);
        agricultureList.add(0, agricultureWheet);
        agricultureList.add(0, agricultureSoy);

        Address address = new Address("CherrySt", "Louisville", "IL", 45125);

        System.out.println("Our Farm Info: ");
        Farm farm = new Farm("Agri&Animals", address, cattle, agricultureList);
        System.out.println(farm.toString());

        System.out.println("the end");





    }
}
