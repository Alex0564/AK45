package lesson11hw;

public class App {
    public static void main(String[] args) {
        //Create 2 computer
        //Get CPU Brand from computer
        //computer.getSystemBlock.getMotherBoard.getCPU.getBrand

        RAM ram1 = new RAM("Dell DDR4","SNPTD3KXC",8);
        CPU cpu1 = new CPU("Dell","400-ATKO");
        MotherBoard motherBoard1 = new MotherBoard("HP","531966",cpu1,ram1);
        GraphicAdapter graphicAdapter1 = new GraphicAdapter("NVIDIA","GeForce RTX 2070");
        Disk disk1 = new Disk("Dell","400-ATLU",960);
        PowerSupply powerSupply1 = new PowerSupply("Dell","N1WJD-850W");
        SystemBlock systemBlock1 = new SystemBlock(powerSupply1,disk1,graphicAdapter1,motherBoard1);
        Mouse mouse1 = new Mouse("Logitech","910-005783",MouseType.WIRED);
        Keyboard keyboard1 = new Keyboard("Roccat","Vulcan 120 AIMO");
        Monitor monitor1 = new Monitor("Samsung","CF398 Curved LED",27);
        Monitor monitor2 = new Monitor("Samsung","G5 Odyssey",27);
        Monitor[] monitors1 = {monitor1,monitor2};
        Computer computer1 = new Computer(mouse1,keyboard1,systemBlock1,monitors1);
        System.out.println(computer1.getSystemBlock().getMoterBoard().getCpu().getBrand());
    }
}
