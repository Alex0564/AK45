package homework11;

public class App{
    public static void main(String[] arg){

        //Computer#1
    CPU myCPU = new CPU("Intel", "Core");
    RAM myRam = new RAM("Platinum RGB", "Coisar dominator");
    GraphicAdapter myAdapter = new GraphicAdapter("Belkin", "F2CD079BT");
    Disk newDisk = new Disk("WD Blue", "WD10EZRZ)", 1222);
    MotherBoard myMotherboard = new MotherBoard(myCPU, myRam, "intel", 500);
    PowerSupply powerSupply = new PowerSupply("Seasonic" , "PSU");
    SystemBlock myBlock = new SystemBlock(powerSupply, newDisk, myAdapter, myMotherboard);
    Mouse mouse = new Mouse("HP", "Matte black");
    Keyboard keyboard = new Keyboard("HP", "Pavilion");
    Monitors1[] monitors1s = {Monitors1.HP, Monitors1.SAMSUNG, Monitors1.ASUS};
    Monitor monitor = new Monitor(monitors1s, "HP", 15443);
    Monitor monitor2 = new Monitor(monitors1s, "HP", 16443);
    Monitor[] monitors = {monitor, monitor2};

    String myCpuBrand = (String) myBlock.getMotherBoard;
    System.out.println("Computer1 CPU brand is" + myCpuBrand);

    Computer computer = new Computer(mouse, keyboard, myBlock, monitors);
    System.out.println(computer.toString());


//Computer#2

CPU cpu2 = new CPU("SAMSUNG", "AMD Ryzen 9");
RAM ram2 = new RAM(32, "AZ World");

System.out.println("Computer2 CPU brand is" + myCpuBrand);

}
}

