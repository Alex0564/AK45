package homework10x;

public class Hw10 {
    public static void main(String[] args) {

        //1//1st-2nd Object of class ComputerComponents
        ComputerComponents component1 = new ComputerComponents("HardDrive", "Seagate", "7200RPM", 2015);
        ComputerComponents component2 = new ComputerComponents("Power Supply", "Corsair", "RM850", 2019);

        //2//1st-2nd Object of class RAM
        RAM ramKit = new RAM("Corsair", "Corsair", "Vengeance LPX", 2019, "16GB");
        RAM ramkit2 = new RAM("G.Skill", "G.Skill", "Ripjaws", 2018, "32GB");

        //3//1st-2nd object of class GPU
        GPU gpu1 = new GPU("NVIDIA RTX 3070", "Gigabyte", "Gaming OC", 2020, "8GB", 5888);
        GPU gpu2 = new GPU("NVIDIA RTX 3090", "ASUS", "Rog Strix", 2020, "24GB", 10496);

        //4//1st-2nd object of class CPU
        CPU cpu1 = new CPU("Intel Core", "INTEL Corp.", "11700K", 2021, 8, HyperThreadingCPU.YES);
        CPU cpu2 = new CPU("RYZEN", "AMD Corp", "5800X", 2020, 8, HyperThreadingCPU.YES);

    }
}
