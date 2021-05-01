package UmidaLesson11HW;

public class App {
    public static void main(String[] args){

        Mouse mouse = new Mouse("Logitech", "MX");

        Keyboard keyboard = new Keyboard("Yamaha", "PSeries");

        Monitor monitor = new Monitor("Dell", "OptiPlex", 18);

        PowerSupply powerSupply = new PowerSupply("Corsair", "AX1000");

        Disk disk = new Disk("X300", "Toshiba", 3);

        GraphicAdapter graphicAdapter = new GraphicAdapter("StarTech", "USB");

        CPU cpu = new CPU("Intel", "Celeron");
        RAM ram = new RAM("Kingston", "Ddr3", 8);
        MotherBoard motherBoard = new MotherBoard("Asus", "ROGStrix", cpu, ram);

        SystemBlock systemBlock = new SystemBlock(powerSupply, disk,graphicAdapter, motherBoard);

        Computer computerAsus = new Computer(mouse, keyboard, systemBlock, monitor);

        System.out.println("---------------Computer 1.");
        String brand = computerAsus.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String model = computerAsus.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println("Computer 1: CPU brand is "+brand+" and model is "+model);

//-----------------Computer 2.

        Mouse mouse2 = new Mouse("Logitech", "M100");

        Keyboard keyboard2 = new Keyboard("Logitech", "MXKeys");

        Monitor monitor2 = new Monitor("Aser", "LED", 23);

        PowerSupply powerSupply2 = new PowerSupply("Corsair", "AX1200");

        Disk disk2 = new Disk("X350", "Toshiba", 2);

        GraphicAdapter graphicAdapter2 = new GraphicAdapter("StarTech", "USB3");

        CPU cpu2 = new CPU("Dell", "PowerEdge");
        RAM ram2 = new RAM("Dell", "2Ex8", 16);
        MotherBoard motherBoard2 = new MotherBoard("Dell", "ROGStrix", cpu2, ram2);

        SystemBlock systemBlock2 = new SystemBlock(powerSupply2, disk2,graphicAdapter2, motherBoard2);

        Computer computerAser = new Computer(mouse2, keyboard2, systemBlock2, monitor2);

        System.out.println("---------------Computer 2.");
        String brand2 = computerAser.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String model2 = computerAser.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println("Computer2: CPU brand is "+brand2+" and model is "+model2);

    }
}
