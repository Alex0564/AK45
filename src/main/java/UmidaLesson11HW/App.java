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

        String brand = computerAsus.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String model = computerAsus.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println("CPU brand is "+brand+" and model is "+model);


    }
}
