package hm11a;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer
        Mouse mouseA = new Mouse("Logitech", "MX", Type.WIRELESS);
        Mouse mouseB = new Mouse("Verbatim", "optical", Type.WIRED);

        Keyboard keyboardA = new Keyboard("Logitech", "MX");
        Keyboard keyboardB = new Keyboard("Dell", "KM636");

        Monitor monitorA = new Monitor("Samsung", "C49RG9", 49);
        Monitor monitorB = new Monitor("Dell", "P2719H", 27);
        Monitor[]monitors = {monitorA,monitorB};

        CPU cpuA = new CPU("AMD", "Ryzen 7");
        CPU cpuB = new CPU("intel", "i7");

        RAM ramA = new RAM("Corsair", "Vengeance", 64);
        RAM ramB = new RAM("Samsung", "DDR3", 8);

        MotherBoard motherBoardA = new MotherBoard("Samsung", "UN55FH6003FXZA", cpuA, ramA);
        MotherBoard motherBoardB = new MotherBoard("Asus", "Maximus XIII Hero", cpuB, ramB);

        PowerSupply powerSupplyA = new PowerSupply("Corsair", "RMx");
        PowerSupply powerSupplyB = new PowerSupply("Corsair", "FX");

        Disk diskA = new Disk("Samsung", "ST1000LM024", 1000);
        Disk diskB = new Disk("Dell", "MD1420",300);

        GraphicAdapter gaA = new GraphicAdapter("Nvida","Quadro");
        GraphicAdapter gaB = new GraphicAdapter("Nvida","GeForce");

        SystemBlock systemBlockA = new SystemBlock(powerSupplyA,diskA,gaA,motherBoardA);
        SystemBlock systemBlockB = new SystemBlock(powerSupplyB,diskB,gaB,motherBoardB);

        Computer computerA = new Computer(mouseA,keyboardA,systemBlockA,monitors);
        Computer computerB = new Computer(mouseB,keyboardB,systemBlockB,monitors);

        String CPUofComputerA = computerA.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String CPUofComputerB = computerB.getSystemBlock().getMotherBoard().getCpu().getBrand();

        System.out.println("ComputerA CPU Brand = "+CPUofComputerA);
        System.out.println("ComputerB CPU Brand = "+CPUofComputerB);

    }
}
