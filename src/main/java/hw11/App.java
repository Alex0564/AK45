package hw11;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
        Homework to Lesson 11 Composition
        1. Create 2 computers
        2. Get CPU Brand from computer
         */

        // Computer 1 creation

        CPU cpu1 = new CPU("Intel", "10th Gen Intel® Core™ i9-11900", "2.5 GHz");
        RAM ram1 = new RAM("Dell", "DDR4 SDRAM SO-DIMM 260-pin", "64 GB");

        MotherBoard motherBoard1 = new MotherBoard("Gigabyte", "Z590I Aorus Ultra", cpu1, ram1);

        GraphicAdapter graphicAdapter1 = new GraphicAdapter("NVIDIA", "GTX 1660 Ti 6GB GDDR6");

        PowerSupply powerSupply1 = new PowerSupply("CWT", "Corsair CX450");

        Disk disk1 = new Disk("Dell", "M.2 PCIe NVMe Class 40 2280", "1 T", HardDriveType.SSD);

        SystemBlock systemBlock1 = new SystemBlock(powerSupply1, disk1, graphicAdapter1, motherBoard1);

        Mouse mouse1 = new Mouse("Dell", "AW310M", MouseType.WIRELESS);

        Keyboard keyboard1 = new Keyboard("Kensington", "Low-Profile", KeyboardType.WIRELESS);

        Monitor monitor1 = new Monitor("Dell", "U2722D", "27'", MonitorType.LED);
        Monitor monitor2 = new Monitor("LG", "27GN950-B", "27'", MonitorType.NANO_IPS);
        Monitor[] monitors1 = {monitor1, monitor2};

        Computer computer1 = new Computer(mouse1, keyboard1, systemBlock1, monitors1);

        // Computer 2 creation

        CPU cpu2 = new CPU("Intel", "10th-generation Intel Core i7", "3.6 GHz");
        RAM ram2 = new RAM("OWC", "DDR4 PC4-21300 SO-DIMM 260 Pin", "128 GB");

        MotherBoard motherBoard2 = new MotherBoard("ASUS", "ROG MAXIMUS XII FORMULA", cpu2, ram2);

        GraphicAdapter graphicAdapter2 = new GraphicAdapter("AMD", "Radeon Pro 5500 XT");

        PowerSupply powerSupply2 = new PowerSupply("Seasonic", "Prime Titanium TX-1000");

        Disk disk2 = new Disk("Seagate", "Seagate IronWolf 10TB NAS", "4 T", HardDriveType.HDD);

        SystemBlock systemBlock2 = new SystemBlock(powerSupply2, disk2, graphicAdapter2, motherBoard2);

        Mouse mouse2 = new Mouse("Logitech", "G603", MouseType.BLUETOOTH);

        Keyboard keyboard2 = new Keyboard("Logitech", "G613", KeyboardType.MECHANICAL);

        Monitor monitor3 = new Monitor("ASUS", "VA27EHE", "27'", MonitorType.PLASMA);
        Monitor monitor4 = new Monitor("Samsung", "CF390", "27'", MonitorType.LED);
        Monitor[] monitors2 = {monitor3, monitor4};

        Computer computer2 = new Computer(mouse2, keyboard2, systemBlock2, monitors2);

        // Get CPU brand from computer 1

        String cpuBrand1 = computer1.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpuModel1 = computer1.getSystemBlock().getMotherBoard().getCpu().getModel();

        System.out.println("*********************************************************");

        System.out.println("Brand of Computer 1 cpu: " + " '" + cpuBrand1 + "'");

        System.out.println("Model of Computer 1 cpu: " + " '" + cpuModel1 + "'");

        // Get CPU brand from computer 2

        String cpuBrand2 = computer2.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpuModel2 = computer2.getSystemBlock().getMotherBoard().getCpu().getModel();

        System.out.println("*********************************************************");

        System.out.println("Brand of Computer 2 cpu: " + " '" + cpuBrand2 + "'");

        System.out.println("Model of Computer 2 cpu: " + " '" + cpuModel2 + "'");

        System.out.println("*********************************************************");

    }
}
