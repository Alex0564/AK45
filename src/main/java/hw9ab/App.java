package hw9ab;

import lesson9.Colors;
import lesson9.Student;
import lesson9.Vehicle;

public class App {
    public static void main(String[]args){
        Cat animal=new Cat("Zinka","black","short");
       System.out.println(animal.getName());

        Computer Mac = new Computer();
        Mac.setColor("Silver");


       // System.out.println(Mac.getColor());

        Mac.printInfo();

        ////////////////////////////////////////

        NewYork area = new NewYork(5, "Manhattan","Queens");

        NewYork anotherSuburban = new NewYork();
        anotherSuburban.setSuburban("Brooklyn");


        //System.out.println(anotherSuburban.getSuburban());
        //System.out.println(area.getUrban());


        Yarn knitting =Yarn.WOOL;

    }
    }

