package hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer

    Monitor Monitor = new Monitor ("Dell", "P Series", 24);
    Disk disk = new Disk("DellEMC", "PowerVault", 12);
    GraphicAdapter graphicAdapter1 = new GraphicAdapter("NVIDIA", "Quadro RTX");
    CPU cpu = new CPU("Intel", "Xeon");
    RAM ram = new RAM("OWC", "DDR4", 128);
    MotherBoard motherBoard = new MotherBoard("Gigabyte", "X570", cpu, ram);
    PowerSupply powerSupply = new PowerSupply("Corsair", "RMx");
    SystemBlock systemBlock = new SystemBlock(powerSupply, disk, graphicAdapter1, motherBoard);
    Keyboard keyboard = new Keyboard("Corsair", "K-70");
    Mouse mouse = new Mouse("Logetech", "M35", mouseType.WIRELESS);
    Computer computer = new Computer(mouse, keyboard, systemBlock, Monitor);

    CPU CPU = computer.getSystemBlock().getMotherBoard().getCpu();
    String CPU_Brand = CPU.getBrand();
    RAM RAM = computer.getSystemBlock().getMotherBoard().getRam();
    String RAM_Brand = RAM.getBrand();

    System.out.println (CPU_Brand);
    System.out.println(RAM_Brand);





    }
}
