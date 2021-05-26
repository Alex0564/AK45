package hw11;

import javax.management.monitor.Monitor;

public class App {
    public static void main(String[] args) {

        Computer computer1 = new Computer("LG","HP","Acer","Lenovo");

        String brandOfMouseofComputer1 = computer1.getMouse();
        System.out.println(brandOfMouseofComputer1);

        String brandOfKeyboard=computer1.getKeyboard();
        System.out.println(brandOfKeyboard);

        Mouse lg = new Mouse("LG","M185");


        Keyboard hp = new Keyboard("HP","2UN30AA");
        SystemBlock acer = new SystemBlock("Corsair","Dell","StarTech","ASRock");
        PowerSupply corsair = new PowerSupply("Corsair","CX450");
        Disk dell = new Disk("Dell","400-ATKO",512);
        GraphicAdapter starTech = new GraphicAdapter("StarTech","USB 3.0");
        MotherBoard asrock = new MotherBoard("ASRock","B450","Intel Core","HyperX Fury");
        CPU intelCore = new CPU("Intel Core","i7-11700k");
        RAM hyperxFury = new RAM("HyperX Fury","RGB3733",4);
        Monitors lenovo = new Monitors("Lenovo","Q24i",15);


        brandOfKeyboard = acer.getDisk();
        System.out.println(brandOfKeyboard);
        brandOfMouseofComputer1 = acer.getGraphicAdapter();
        System.out.println(brandOfMouseofComputer1);

        String systemBlock = computer1.getSystemBlock();
        System.out.println(systemBlock);


    }
}
