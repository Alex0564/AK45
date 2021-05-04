package hw12;

public class CardboardBox implements IBox{
    protected double length;
    protected double width;
    protected double height;

    public CardboardBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public void type() {
        System.out.println("Im cardboard box. My size is "+mailingSize());

    }

    @Override
    public double mailingSize() {
        return length+width+height;

    }
}
