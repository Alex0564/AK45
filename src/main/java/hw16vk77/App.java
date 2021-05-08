package hw16vk77;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class App {
    public static void main(String[] args) {
        /*
        Create a class Farm
        fields
        private String name;
        private Address address; ()
        private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS...
                                                   Value    - Integer - number of animals of each kind)
        private List<AgreeCultural> agreeCultural; (AgreeCultural - class
                                                    private String nameOfCulture; Wheat, Soya, Pea
                                                    private int fielsNumber;

        method printInfo() - print out all info
        * */
        //Start

        //Create address
        Address americaFoodaddress = new Address();//object created by default empty constructor
        //Fillout address
        americaFoodaddress.setAddress("English Creek","NJ","Asbury Road",194,"08330");
        //Create cattle as HashMap collection
        HashMap<Cattle,Integer> cattle = new HashMap<>();
        //FILL OUT CATTLES (I put 80 by default)
        for (Cattle v: Cattle.values()){
            cattle.put(v,80);
        }
        // Create agreecultures and register them by using special method registerAgriculture()
        AgriCultural agcultWheat = new AgriCultural(); // empty construtor - just for test
        //register agreeculture - fill out Wheat, Soya, Pea, Peanut
        agcultWheat.registerAgriculture("Wheat",1);
        //Create other agreecultures using full constructor
        AgriCultural agcultSoya = new AgriCultural("Soya",2);
        AgriCultural agcultPee = new AgriCultural("Pee",3);
        AgriCultural agcultPeanut = new AgriCultural("Peanut",4);

        //put them into ArrayList
        List<AgriCultural> agriCultural = new ArrayList<>();
        agriCultural.add(agcultWheat);
        agriCultural.add(agcultSoya);
        agriCultural.add(agcultPee);
        agriCultural.add(agcultPeanut);
        /////CREATE FARM
        Farm BriarOakFarm = new Farm("Briar Oak Farm",americaFoodaddress,cattle, agriCultural);

        System.out.println("Home  work #16 - Farm");
        System.out.println("=======================");
        //call method printInfo() - implemented in the Farm class
        BriarOakFarm.printInfo();





    }
}
