package hw11;

public class CompA {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer

        CPU cpuCompA = new CPU("Intel ","Core i9");
        RAM ramCompA = new RAM("Samsung","HBM2",64);

        MotherBoard motherBoardCompA = new MotherBoard("GIGABYTE", "X570 AORUS MASTER",cpuCompA,ramCompA);

        GraphicAdapter graphicAdapterCompA = new GraphicAdapter("ARKTEK GeForce","GT730 D5");
        Disk diskCompA = new Disk("HPE","764908-B21",2);
        PowerSupply powerSupplyCompA = new PowerSupply("HP","PS-8501-2 - 500W");

        SystemBlock systemBlockCompA = new SystemBlock(powerSupplyCompA,diskCompA,graphicAdapterCompA,motherBoardCompA);

        Mouse mouseCompA = new Mouse("Logitech","M317c");
        Keyboard keyboardCompA = new Keyboard("Logitech","K845 104-key TTC Brown");

        Monitor monitorCompA1 = new Monitor("Samsung ","T350 Series LF24T350FHNXZA",24);
        Monitor monitorCompA2 = new Monitor("Samsung ","T450 Series LF24T350F",32);
        Monitor[] monitors = {monitorCompA1,monitorCompA2};

        Computer compA = new Computer(mouseCompA,keyboardCompA,systemBlockCompA,monitors);

        String cpu = compA.getSystemBlock().getMotherBoard().getCpu().getBrand();
        System.out.println(cpu);

        System.out.println(compA.toString());

    }
}
