package UmidaLesson16HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Address grandmasAddress = new Address("34thStreet", "Everglade", "FL", 33563);

        HashMap<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEYS, 150);
        cattle.put(Cattle.COWS, 120);
        cattle.put(Cattle.CHICKENS, 250);
        cattle.put(Cattle.PIGS, 20);
        cattle.put(Cattle.SHEEPS, 170);

        List<Agricultural>agriculturals = new ArrayList<>();
        Agricultural soya = new Agricultural("soya", 2);
        Agricultural pee = new Agricultural("pee", 2);
        Agricultural wheat = new Agricultural("wheat", 2);
        List<Agricultural> agriculturalList = new ArrayList<>();
        agriculturalList.add(soya);
        agriculturalList.add(pee);
        agriculturalList.add(wheat);


        Farm grandmas = new Farm("Grandmas", grandmasAddress, cattle, agriculturalList);
    }
}
