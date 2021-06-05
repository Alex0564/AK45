package hw11;

// Create 2 computers
// Get CPU Brand from computer

public class App {

    public static void main(String[] args) {

        Keyboard keyboard1 = new Keyboard("Razer", "BlackWidow", DevTypes.WIRED);
        Keyboard keyboard2 = new Keyboard("Logitech", "K50", DevTypes.WIRELESS);

        Mouse mouse1 = new Mouse("Razer", "Naga", DevTypes.WIRELESS);
        Mouse mouse2 = new Mouse("Logitech", "M75", DevTypes.WIRELESS);

        Disk disk1 = new Disk("Samsung", 500);
        Disk disk2 = new Disk("Seagate", 3000);

        RAM ram1 = new RAM("Corsair", "Vengeance LPX", 16);
        RAM ram2 = new RAM("HyperX", "Fury", 16);

        PowerSupply powerSupply1 = new PowerSupply("Corsair", "RMx");
        PowerSupply powerSupply2 = new PowerSupply("EVGA", "GQ");

        CPU cpu1 = new CPU("Intel", "i9");
        CPU cpu2 = new CPU("AMD", "Ryzen 9");

        Monitor monitor1 = new Monitor("LG", "Ultra Gear", 27);
        Monitor monitor2 = new Monitor("Samsung", "Odyssey", 49);

        MotherBoard motherBoard1 = new MotherBoard("ASUS", "ROG", cpu1, ram1);
        MotherBoard motherBoard2 = new MotherBoard("GIGABYTE", "AORUS Master", cpu2, ram2);

        SystemBlock systemBlock1 = new SystemBlock(powerSupply1, disk1, motherBoard1);
        SystemBlock systemBlock2 = new SystemBlock(powerSupply2, disk2, motherBoard2);

        Computer computer = new Computer();

        Monitor[]monitors = {monitor1, monitor2};
        computer.setMonitors(monitors);

        Computer computer1 = new Computer(mouse1, keyboard1, systemBlock1, monitors);
        Computer computer2 = new Computer(mouse2, keyboard2, systemBlock2, monitors);

        String cpuComp1 = computer1.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpuComp2 = computer2.getSystemBlock().getMotherBoard().getCpu().getBrand();

        System.out.println("Computer1 CPU brand is "+cpuComp1);
        System.out.println("Computer2 CPU brand is "+cpuComp2);


    }
}
