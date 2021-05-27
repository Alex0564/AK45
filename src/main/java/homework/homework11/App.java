package homework.homework11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer

        Monitor monitor1 = new Monitor("Asus","A 270",27);
        Monitor monitor2 = new Monitor("Dell","EZ24",24);
        Keyboard keyboard1 = new Keyboard("Logitech","MX");
        Keyboard keyboard2 = new Keyboard("Redragon","K552");
        Mouse mouse1 = new Mouse("Razer","Viper");
        Mouse mouse2 = new Mouse("Logitech","M510");
        PowerSupply powerSupply1 = new PowerSupply("Corsair","CX series 450");
        PowerSupply powerSupply2 = new PowerSupply("EVGA","600BR");
        Disk disk1 = new Disk("Seagate","BarraCuda",8);
        Disk disk2 = new Disk("Western Digital","Red Plus",4);
        GraphicAdapter graphicAdapter1 = new GraphicAdapter("Asus","GeForce GTX 1660");
        GraphicAdapter graphicAdapter2 = new GraphicAdapter("Gigabyte","GeForce GTX 1550 Ti");
        CPU cpu1 = new CPU("Intel","Core i7-9700K");
        CPU cpu2 = new CPU("AMD","Ryzen 7 3700X");
        RAM ram1 = new RAM("Corsair","Vengeance LPX",8);
        RAM ram2 = new RAM("Samsung","DDR4",16);
        MotherBoard motherBoard1 = new MotherBoard("Asus","ROG Strix B450-F",cpu1,ram1);
        MotherBoard motherBoard2 = new MotherBoard("Gigabyte","B450M",cpu2,ram2);
        SystemBlock systemBlock1 = new SystemBlock(powerSupply1,disk1,graphicAdapter1,motherBoard1);
        SystemBlock systemBlock2 = new SystemBlock(powerSupply2,disk2,graphicAdapter2,motherBoard2);
        Computer computer1 = new Computer(mouse1,keyboard1,systemBlock1,monitor1);
        Computer computer2 = new Computer(mouse2,keyboard2,systemBlock2,monitor2);
        System.out.println("Brand of 1st computer's CPU is "+computer1.getSystemBlock().getMotherBoard().getCpu().getBrand());
        System.out.println("Brand of 2nd computer's CPU is "+computer2.getSystemBlock().getMotherBoard().getCpu().getBrand());

    }
}
