package hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer
        //COMPUTER
        Mouse mouse=new Mouse("Logitech", "M720");
        Keyboard keyboard=new Keyboard("Logitech", "Craft");
        Monitor monitor=new Monitor("HP", "27mq", 27);
        //System Block
        PowerSupply powerSupply=new PowerSupply("Corsair", "RM1000x");
        Disk disk=new Disk("Dell", "400-AGMN", 6);
        GraphicAdapter graphicAdapter=new GraphicAdapter("NVIDIA", "GeForce RTX 2070");
        //Motherboard
        CPU cpu = new CPU("Intel", "Core i5-10600K");
        RAM ram= new RAM("Corsair", "Vengeance LED", 16);
        MotherBoard motherBoard=new MotherBoard("GIGABYTE", "Z390 AORUS XTREME", cpu, ram);

        SystemBlock systemBlock=new SystemBlock(powerSupply, disk, graphicAdapter, motherBoard);
        Computer computer=new Computer(mouse,keyboard,systemBlock,monitor);

        String cpuBrand = computer.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpuModel = computer.getSystemBlock().getMotherBoard().getCpu().getModel();

        System.out.println(cpuBrand);
        System.out.println(cpuModel);

    }
}
