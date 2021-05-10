package comp;

public class App10 {
    public static void main(String[] args) {

        RAM1 ram1 = new RAM1("Kingston", "KCP426NS6", 4);
        RAM1 ram2 = new RAM1("AMD", "R338G1339S2S-U", 8);

        CPU1 cpu1 = new CPU1("INTEL", "Core i5");
        CPU1 cpu2 = new CPU1("AMD", "A8 9600");

        MotherBoard1 motherBoard1 = new MotherBoard1("ASROCK", "A320M-DVS R4.0", cpu1, ram1);
        MotherBoard1 motherBoard2 = new MotherBoard1("ASUS", "PRIME H310M-R R2.0", cpu2, ram2);

        GraphicAdapter1 graphicAdapter1 = new GraphicAdapter1("ASUS", "NVIDIA GeForce GTX 1650");
        GraphicAdapter1 graphicAdapter2 = new GraphicAdapter1("GIGABYTE", "nVidia GeForce RTX 2060");

        Disk1 disk1 = new Disk1("WD", "Caviar Blue WD10EZEX", 1);
        Disk1 disk2 = new Disk1("TOSHIBA", "P300 HDWD110UZSVA", 1);

        PowerSupply1 powerSupply1 = new PowerSupply1("AEROCOOL", "VX PLUS");
        PowerSupply1 powerSupply2 = new PowerSupply1("THERMALTAKE", "TR2 S");

        SystemBlock1 systemBlock1 = new SystemBlock1(powerSupply1, disk1, graphicAdapter1, motherBoard1);
        SystemBlock1 systemBlock2 = new SystemBlock1(powerSupply2, disk2, graphicAdapter2, motherBoard2);

        Mouse1 mouse1 = new Mouse1("LOGITECH", " M170", Type.WIRELESS);
        Mouse1 mouse2 = new Mouse1("LOGITECH", "G102 LIGHTSYNC", Type.WIRED);

        Keyboard1 keyboard1 = new Keyboard1("LOGITECH", "K400 Plus", Type.WIRELESS);
        Keyboard1 keyboard2 = new Keyboard1("DELL", "KB216", Type.WIRED);

        Monitor1 monit1 = new Monitor1("VIEWSONIC", " VA2418SH", 23);
        Monitor1 monit2 = new Monitor1("ASUS", " VA24DQ", 23);
        Monitor1 monit3 = new Monitor1("ASUS", "Gaming VA27EHE", 27);

        Monitor1[] monitor1 = {monit1, monit2, monit3};
        Monitor1[] monitor2 = {monit1, monit3};

        Computer1 computer1 = new Computer1(mouse1, keyboard1, systemBlock1, monitor1);
        Computer1 computer2 = new Computer1(mouse2, keyboard2, systemBlock2, monitor2);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer2.getSystemBlock().getMotherBoard().getCpu());

        Computer1 computer3 = new Computer1();
        computer3.setKeyboard(keyboard1);
        computer3.setMouse(mouse1);
        computer3.setMonitors(monitor1);
        computer3.setSystemBlock(systemBlock1);
        System.out.println(computer3);
        System.out.println(computer3.getSystemBlock().getMotherBoard().getCpu());

        cpu1.printCUP1();
        disk1.printDisk1();
        graphicAdapter1.printGraphicAdapter1();
        keyboard1.printKeyboard1();
        monit1.printMonitor1();
        motherBoard1.printMotherBoard1();
        mouse1.printMouse1();
        powerSupply1.printPowerSupply1();
        ram1.printRAM1();














    }
}
