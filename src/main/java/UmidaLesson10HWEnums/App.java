package UmidaLesson10HWEnums;

import java.util.Arrays;

public class App {

    //Class with Enums
    public static void main(String[] args){

        Moisturizer Dove = new Moisturizer("Dove", "faceCream", 16, SPF.SPF30);
        System.out.println("I got "+Dove.getSPF()+" "+Dove.getBrand()+" "+Dove.getType());

        Moisturizer LaRochePosay = new Moisturizer("LaRochePosay", "thermalWater", 25, SPF.SPF15);
        System.out.println("Broad Spectrum of "+ LaRochePosay.getType()+" is "+LaRochePosay.getSPF());

    //Class with Array of Enums
        System.out.println("----------------------");

        Sunscreen sunscreen = new Sunscreen("spray", 300, SPF.values());

        SPF[] sunscreenSpf = {SPF.SPF15, SPF.SPF20, SPF.SPF30, SPF.SPF40,SPF.SPF50};
        sunscreen.setSpf(sunscreenSpf);
        System.out.println(Arrays.toString(sunscreenSpf));
    }
}
