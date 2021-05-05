package ArtuomLesson12HWB;

public class App {

    public static void main(String[] args) {
        System.out.println("=============2 object in 2 classe===================");


        LapTop My = new LapTop("Samsung", Colors.GREEY, 2020);
        My.Donthitthelapttop();
        My.Donotwasрthelaptopinthesink();

        LapTop Mary = new LapTop("Dell", Colors.BLACK, 2021);
        Mary.Donthitthelapttop();
        Mary.Donotwasрthelaptopinthesink();


        LaptopArt Art = new LaptopArt("Samsung", Colors.BLACK, 2021, "USA");
        Art.Donthitthelapttop();
        Art.Donotwasрthelaptopinthesink();

        LaptopArt Ver = new LaptopArt("Lenovo", Colors.GREEY, 2021, "USA");
        Ver.Donthitthelapttop();
        Ver.Donotwasрthelaptopinthesink();


        System.out.println("=================================Iteration===========================");

        MILSTD810F Lap = new LapTop("Dell", Colors.GREEY, 2021);
        MILSTD810F LAP = new LaptopArt("Samsung", Colors.GREEY, 2021, "USA");

        MILSTD810F[] laptop = {Lap, LAP};
        for (MILSTD810F Laptops : laptop) {
            Laptops.Donthitthelapttop();
        }

//            Laptops.Donthitthelapttop();//-Выдает 2 разных значения, потому что в 2 классах написано по разному

    System.out.println("======================Assigning one object to interface type==============");


     MILSTD810F LaptopTims = new LapTop("Sharp", Colors.GREEY, 2020);
     MILSTD810F LAPTOPANN = new LaptopArt("HP", Colors.GREEY, 2021, "USA");
     LaptopTims.Donthitthelapttop();
     LaptopTims.Donthitthelapttop();

      LAPTOPANN.Donthitthelapttop();
      LAPTOPANN.Donotwasрthelaptopinthesink();



    }
}
