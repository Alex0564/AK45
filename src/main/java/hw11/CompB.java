package hw11;

public class CompB {
    public static void main(String[] args) {
        CPU cpuCompB = new CPU("AMD ","Ryzen 5 3600X");
        RAM ramCompB = new RAM("Micron","SGRAM (GDDR5X)",32);

        MotherBoard motherBoardCompB = new MotherBoard("PowerEdge", "FC830",cpuCompB,ramCompB);

        GraphicAdapter graphicAdapterCompB = new GraphicAdapter("NVIDIA","Quadro P620");
        Disk diskCompB = new Disk("Dell","400-ATKL",4);
        PowerSupply powerSupplyCompB = new PowerSupply("Lenovo","00PC745 - 180W");

        SystemBlock systemBlockCompB = new SystemBlock(powerSupplyCompB,diskCompB,graphicAdapterCompB,motherBoardCompB);

        Mouse mouseCompB = new Mouse("Microsoft","3500");
        Keyboard keyboardCompB = new Keyboard("ROCCAT","Vulcan 120 AIMO");

        Monitor monitorCompB1 = new Monitor("Dell","U4021QW",40);
        Monitor monitorCompB2 = new Monitor("Dell","U4023QW",35);
        Monitor[] monitors = {monitorCompB1,monitorCompB2};

        Computer compB = new Computer(mouseCompB,keyboardCompB,systemBlockCompB,monitors);


        String cpu = compB.getSystemBlock().getMotherBoard().getCpu().getBrand();
        System.out.println(cpu);

        System.out.println(compB.toString());
    }
}
