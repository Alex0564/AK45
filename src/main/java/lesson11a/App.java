package lesson11a;

public class App {
    public static void main(String[] args) {


        Monitor myMonitor = new Monitor("Dell","A13",13);
        Mouse myMouse = new Mouse("MS","B16");
        Keyboard myKeyboard = new Keyboard("MS","K16");
        Disk myDisk = new Disk("WD","D16",800);
        PowerSupply myPS = new PowerSupply("INTEL","Power");
        GraphicAdapter myGA = new GraphicAdapter("Toshiba","GA 16");
        MotherBoard myMB = new MotherBoard("MS","MB 16","AMD","16");
        RAM myRAM = new RAM("MS","RAM 16",8);
        CPU myCPU = new CPU("MS","CPU 16");
        SystemBlock myBlock = new SystemBlock(myPS,myDisk,myGA,myMB);
        Computer myComputer = new Computer(myMouse,myKeyboard,myBlock,myMonitor);

        ////////////////////////////////////////////////////////////////////////////////////

        CPU bCPU = new CPU("Toshiba","CPU 20");
        RAM bRAM = new RAM("WD","RAM 20",16);
        PowerSupply bPS = new PowerSupply("INVideo","Power 2");
        GraphicAdapter bGA = new GraphicAdapter("DELL","GA 20");
        MotherBoard bMB = new MotherBoard("Asus","MB 20","Toshiba","MS");
        Disk bDisk = new Disk("WD","Disk 20",600);
        Mouse bMouse = new Mouse("Apple","Mouse 2");
        Keyboard bKeyboard = new Keyboard("Apple","Key 2");
        Monitor bMonitor = new Monitor("Samsung","M 20",20);
        SystemBlock bSB = new SystemBlock(bPS,bDisk,bGA,bMB);
        Computer bComp = new Computer(bMouse,bKeyboard,bSB,bMonitor);

        ////////////////////////////////////////////////////////////////////////////////////////


        String pathCPU = bMB.getCpu();
        System.out.println(pathCPU);
        }
    }

