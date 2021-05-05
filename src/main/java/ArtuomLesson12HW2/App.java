package ArtuomLesson12HW2;

public class App {
    public static void main(String[] args) {
        System.out.println("----------1st object-2objects-------------");
        Tesla greyTesla = new Tesla("grey", "TeslaX");
        greyTesla.acceleration();
        greyTesla.emergencyWarning();
        Tesla redTesla = new Tesla("red", "Y");
        redTesla.acceleration();
        redTesla.emergencyWarning();

        System.out.println("----------2nd class-2objects-------------");
        Mercedes mercedesBenz = new Mercedes("MercedesX5", "metallic", 2021);
        mercedesBenz.acceleration();
        mercedesBenz.emergencyWarning();
        Mercedes mercedesGLA = new Mercedes("mercedesGLA", "white", 2018);
      //  mercedesGLA.acceleration();
        //mercedesGLA.emergencyWarning();

        System.out.println("-----------Assigning one object to interface type");
        ICars mercedesCLA = new Mercedes("red", "CLA", 2015);
        ICars teslaS = new Tesla("grey", "S");
        mercedesCLA.acceleration();
        mercedesCLA.emergencyWarning();
     //   teslaS.acceleration();
      //  teslaS.emergencyWarning();
    }
}
