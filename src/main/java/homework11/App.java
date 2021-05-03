package homework11;

public class App{
    public static <Monitors> void main(String[] arg){


        //Computer#1
    CPU myCPU = new CPU("Intel", "Core");
    RAM myRam = new RAM("Platinum RGB", "Coisar dominator");
    GraphicAdapter myAdapter = new GraphicAdapter("Belkin", "F2CD079BT");
    Disk newDisk = new Disk("WD Blue", "WD10EZRZ)");
    MotherBoard myMotherboard = new MotherBoard(myCPU, myRam, "intel", 500);
    SystemBlock myBlock = new SystemBlock(newDisk, myMotherboard, myAdapter);
        String myCpuBrand = (String) myBlock.getMotherBoard;
        System.out.println("Computer1 CPU brand is" + myCpuBrand);


//Computer#2

CPU cpu2 = new CPU("SAMSUNG", "AMD Ryzen 9");
RAM ram2 = new RAM(32, "AZ World");

System.out.println("Computer2 CPU brand is" + myCpuBrand);

}
}

