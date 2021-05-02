package hw11.Copmuter2;

import hw11.Keyboard;
import hw11.Mouse;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class App2 {
    public static void main(String[] args) {

        Display display = new Display("Apple", 27, "Retina 5K");
        Processor processor = new Processor("3.8GHz 8‑core 10th-generation Intel Core i7, Turbo Boost up to 5.0GHz");
        Memory memory = new Memory("8GB (two 4GB) of 2666MHz DDR4 memory; four SO-DIMM slots, user accessible");
        Storage storage = new Storage("512GB SSD");
        Graphics graphics = new Graphics("AMD Radeon Pro 5500 XT with 8GB of GDDR6 memory");
        Keyboard keyboard = new Keyboard("Apple", "Magic Keyboard");
        Mouse mouse = new Mouse("Apple", "Magic Mouse");
        OperatingSystem operatingSystem = new OperatingSystem("macOS");
        iMac iMac = new iMac(display, processor, memory, storage, graphics, keyboard, mouse, operatingSystem);

        String mouseModel = iMac.getMouse().getModel();
        String MemoryInfo = iMac.getMemory().getMemorySpecifications();
        System.out.println(mouseModel);
        System.out.println(MemoryInfo);
    }
}

