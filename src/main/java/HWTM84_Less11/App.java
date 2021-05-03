package HWTM84_Less11;

public class App {
    public static void main(String[] args) {
        //create 2 computers
        // Get CPU Brand from computer
////////------------------------Start Systemblock----------------------------
////--------------------------Start Motherboard-------------------------
        //--------------------------RAM-------------------------
        RAM Apacer = new RAM("Apacer", "DDR2", 2100, 2);
        RAM Kingston = new RAM("Kingston", "DDR4", 4200, 16);
        RAM Micron = new RAM("Micron", "DDR4", 3800, 8);
        RAM Kingmax = new RAM("Kingmax", "DDR3", 3200, 4);
        //--------------------------CPU-------------------------
        CPU i7 = new CPU("Intell", "Core i7", "1150", 4200);
        CPU i5 = new CPU("Intell", "Core i5", "1151", 3700);
        CPU AMD5 = new CPU("AMD", "Ryzen 5", "AM4", 3500);
        CPU AMD9 = new CPU("AMD", "Ryzen 9", "AM4", 4500);
        //-------------------------Motherboard------------------------------
        Motherboard Asus = new Motherboard("ASUS", i7, Kingston);
        Motherboard Asrock = new Motherboard("ASRock", i5, Kingmax);
        Motherboard Gygabyte = new Motherboard("Gygabyte", AMD5, Micron);
        Motherboard Msi = new Motherboard("MSI", AMD9, Kingston);
////--------------------------END Motherboard-------------------------
//--------------------------HDD-------------------------
        HDD Seagate = new HDD("Seagate", "HDD", 1000);
        HDD Samsung = new HDD("Samsung", "SSD", 512);
        HDD Western = new HDD("Western digital", "HDD", 2000);
        HDD Maxtor = new HDD("Maxtor", "SSD", 620);
//--------------------------PowerSupply-------------------------
        PowerSupply Thermaltake = new PowerSupply("Thermaltake", "850W");
        PowerSupply Dellpower = new PowerSupply("Dell Power", "1300W");
//--------------------------VGA-------------------------
        VGA Fx1060 = new VGA("GeForce FX1060", 4);
        VGA Rx570 = new VGA("AMD Radeon RX570", 8);
        VGA Fx2060 = new VGA("GeForce GTX2060", 8);
        VGA Fx3070 = new VGA("GeForce GTX3070", 16);
        //---------------------System block------------------------------
        Systemblock SuperGame = new Systemblock(Msi, Maxtor, Dellpower, Fx3070);
        Systemblock GamePro = new Systemblock(Asus,Samsung, Dellpower, Fx2060);
        Systemblock Game = new Systemblock(Asrock, Western, Thermaltake, Rx570);
        Systemblock Work = new Systemblock(Gygabyte, Seagate, Thermaltake, Fx1060);
////////------------------------End Systemblock----------------------------
        System.out.println(Game.getMotherboard().getCpu().getBrand()+" "+Game.getMotherboard().getCpu().getModel());
        System.out.println(SuperGame.getMotherboard().getCpu().getBrand()+" "+SuperGame.getMotherboard().getCpu().getModel());
    }
}
