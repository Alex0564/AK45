package hw12;

public class PlasticBox extends CardboardBox{

    public PlasticBox(double length, double width, double height) {
        super(length, width, height);

    }

    @Override
    public void type(){

        System.out.println("Im plastic box. My size is "+mailingSize());

    }

}
