package HWTM84_Less13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //---------------------------------String[]------------------------
        List<String>cpu = new ArrayList<>();
        cpu.add("Intel core I5");
        cpu.add("Intel core I7");
        cpu.add("AMD Ryzen 7");

        for (int i=0;i<cpu.size();i++){
            System.out.println(cpu.get(i));
        }
        cpu.set(2,"AMD Ryzen 9");
        System.out.println(cpu);
        cpu.remove(1);
        System.out.println(cpu);
        System.out.println(cpu.get(1));
        //--------------------------------//String[]---------------------------
        //----------------------------------int[]--------------------
        List<Integer>arr =new ArrayList<>();
        arr.add(34);
        arr.add(7);
        arr.add(2);
        arr.add(18);
        arr.add(94);
        arr.add(9);
        System.out.println(arr.size());
        int n = arr.size()-1;
        while (arr.size()>0){
            arr.remove(n);
            n--;
            System.out.println(arr);
        };
        //-----------------------------------//int[]----------------------
        //-----------------------------------Custom class[]----------------------
        List<Cars> car = new ArrayList<>();
        Cars c1 = new  Cars("Mazda");
        car.add(c1);
        Cars c2 = new Cars("Volvo");
        car.add(c2);
        Cars c3 = new Cars("Nissan");
        car.add(c3);
        Cars c4 = new Cars("Mercedes");
        car.add(c4);
        for (int i = 0;i<car.size();i++){
            System.out.println(car.get(i).getName());
        }
        System.out.println("---End---");
        //-----------------------------------//Custom class[]----------------------


    }
}
