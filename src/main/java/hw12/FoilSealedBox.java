package hw12;

public class FoilSealedBox extends CardboardBox{

    public FoilSealedBox(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public void type(){

        System.out.println("Im foil sealed box. My size is "+mailingSize());

    }

}
