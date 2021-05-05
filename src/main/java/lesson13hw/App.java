package lesson13hw;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> cellPhones = new ArrayList<String>();
        cellPhones.add("Iphone");
        cellPhones.add("Samsung");
        cellPhones.add("LG");
        cellPhones.add(2,"Motorola");
        System.out.println(cellPhones);
        cellPhones.set(3,"Huawei");
        String oldValue = cellPhones.set(2,"LG");
        System.out.println(oldValue);
        System.out.println(cellPhones);
        cellPhones.add("Nokia");
        cellPhones.add(3,"Google Phone");
        System.out.println(cellPhones);
        System.out.println(cellPhones.size());

        for (String cellPhone : cellPhones){
            System.out.println(cellPhone);
        }

    }
}
