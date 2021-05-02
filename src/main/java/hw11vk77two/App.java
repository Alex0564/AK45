package hw11vk77two;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer


        //Compose

        //1 Motherboard
        CPU intel = new CPU("Intel","Core i7",2600);
        CPU amd = new CPU("AMD Ryzen","9 3600",3.6);

        RAM ddr3 = new RAM("crucial","DDR3",16);
        RAM ddr4 = new RAM("crucial","DDR4",8);

        GraphicAdapter videocardnvidia = new GraphicAdapter("NVidia","GT730");
        GraphicAdapter videocardamd = new GraphicAdapter("NVidia","GT730");

        Disk ssd = new Disk("Samsung","Evo 8",512);
        Disk hdd = new Disk("WD","Blue",1024);

        Keyboard keyb = new Keyboard("Logitech","MK350");
        Keyboard keybdell = new Keyboard("DELL","DellKeyb");

        Monitor monitorlenovo = new Monitor("Lenovo","L28u-30",32);
        Monitor monitorlsamsung = new Monitor("Samsung","Odyssey G9",49);
        Monitor monitorldell = new Monitor("DELL","S2421HS",24);

        Monitor[] mymonitors =  {monitorlsamsung,monitorldell,monitorlenovo};
        Monitor[] davemonitors =  {monitorldell,monitorldell};

        MotherBoard mbasus = new MotherBoard("Asus","ROG350",intel,ddr3);
        MotherBoard mbmsi = new MotherBoard("MSI","H360",amd,ddr4);

        Mouse mouseusb =new Mouse("Logitech","LM1201");
        Mouse mousebluetooth =new Mouse("Logitech","LB151");

        PowerSupply ps550w = new PowerSupply("Zalman","PowerArt 550W");
        PowerSupply ps650w = new PowerSupply("EVGA","Surge 650W");

        SystemBlock mysystemblock = new SystemBlock(ps550w,hdd,videocardnvidia,mbasus);
        SystemBlock brosystemblock = new SystemBlock(ps650w,ssd,videocardamd,mbmsi);

        Computer mypc = new Computer(mousebluetooth,keyb,mysystemblock,mymonitors);
        Computer bropc = new Computer(mouseusb,keyb,brosystemblock,davemonitors);

        System.out.println("CPU brand:");
        //3 ways to get CPU brand from mypc object
        //1
        System.out.println(mypc.cpubrand());
        //2
        System.out.println(mypc.getSystemBlock().cpuBrand());
        //3
        System.out.println(mypc.getSystemBlock().getMotherBoard().getCpu().Cpubrand());


        //3 ways to get CPU brand from bropc object
        //1
        System.out.println(bropc.cpubrand());
        //2
        System.out.println(bropc.getSystemBlock().cpuBrand());
        //3
        System.out.println(bropc.getSystemBlock().getMotherBoard().getCpu().Cpubrand());


        //


    }
}
