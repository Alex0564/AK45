package hw11;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer
        Mouse logitechMouse = new Mouse("Logitech", "M705");
        Mouse razer = new Mouse("Razer", "DeathAdder");
        Keyboard logitechKey = new Keyboard("Logitech", "MK295");
        Keyboard redragon = new Keyboard("Redragon", "S101");
        PowerSupply segotep = new PowerSupply("Segotep", "GF750");
        PowerSupply aresgame = new PowerSupply("Aresgame", "AGV650");
        Monitor hp = new Monitor("HP", "VH240a", 24);
        Monitor samsung = new Monitor("SAMSUNG", "SR35", 27);
        CPU intel = new CPU("Intel", "Core i7");
        CPU amd = new CPU("AMD", "Ryzen 7");
        Disk seagate = new Disk("Seagate", "Archive", 8);
        Disk western = new Disk("Western Digital", "WD Purple", 8);
        GraphicAdapter nvidia = new GraphicAdapter("NVIDIA", "RTX 2060");
        GraphicAdapter asus = new GraphicAdapter("ASUS", "RTX 3060");
        RAM teamgroup = new RAM("TEAMGROUP", "Vulcan Z", 32);
        RAM corsair = new RAM("Corsair", "VENGEANCE", 32);

        MotherBoard myMotherBoard = new MotherBoard("ASUS", "B450-F", amd, corsair);
        SystemBlock mySystemBlock = new SystemBlock(segotep, western, nvidia, myMotherBoard);
        Computer myComputer = new Computer(mySystemBlock, hp, logitechKey, logitechMouse);
        MotherBoard wifeMotherboard = new MotherBoard("ASUS", "B250-A", intel, corsair);
        SystemBlock wifeSystemBlock = new SystemBlock(aresgame, seagate, asus, wifeMotherboard);
        Computer wifeComputer = new Computer(wifeSystemBlock, samsung, redragon, razer);

        String myCpu = myMotherBoard.getCpu().getBrand();
        System.out.println("Brand CPU in my computer: " + myCpu);
    }
}
