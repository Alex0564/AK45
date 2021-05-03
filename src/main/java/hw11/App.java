package hw11;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer

//Computer1
        CPU cpu1 = new CPU("INTEL", "11700K");
        RAM ram1 = new RAM("G.Skill", "Ripjaws", 32);
        MotherBoard motherboard1 = new MotherBoard("Asus", "Z590", cpu1, ram1);

        GraphicAdapter gpu1 = new GraphicAdapter("ASUS", "RTX 2060 Rog Strix");
        PowerSupply psu1 = new PowerSupply("Corsair", "RM850");
        Disk hdd1 = new Disk("Seagate", "7200RPM", 500);
        SystemBlock systemBlock1 = new SystemBlock(psu1, hdd1, gpu1, motherboard1);

        Keyboard keyboard1 = new Keyboard("Turtle Beach", "Impact 100");
        Mouse mouse1 = new Mouse("Logitech", "G502");
        Monitor monitor1 = new Monitor("MSI", "Optix MAG274QRF-QD", 27);

        Computer OldComputer = new Computer(mouse1, keyboard1, systemBlock1, monitor1);

        String CpuBrand = OldComputer.getSystemBlock().getMotherBoard().getCpu().getBrand();
        System.out.println("Cpu of 1st Computer is " + CpuBrand);

//Computer2
        CPU cpu2 = new CPU("AMD", "R5 5600X");
        RAM ram2 = new RAM("G.Skill", "Trident Z", 64);
        MotherBoard motherboard2 = new MotherBoard("AsRock", "B550", cpu2, ram2);

        GraphicAdapter gpu2 = new GraphicAdapter("PowerColor", "Vega 56 RedDragon");
        PowerSupply psu2 = new PowerSupply("Corsair", "RM850");
        Disk sdd = new Disk("Samsung", "860 EVO", 1024);
        SystemBlock systemBlock2 = new SystemBlock(psu2, sdd, gpu2, motherboard2);

        Keyboard keyboard2 = new Keyboard("Logitech", "G915 Lightspeed");
        Mouse mouse2 = new Mouse("Corsair", "Harpoon");
        Monitor monitor2 = new Monitor("Lg", "GN950)", 27);

        Computer NewComputer = new Computer(mouse2, keyboard2, systemBlock2, monitor2);

        String CpuBrand2 = NewComputer.getSystemBlock().getMotherBoard().getCpu().getBrand();
        System.out.println("Cpu of 2nd Computer is " + CpuBrand2);

    }

}
