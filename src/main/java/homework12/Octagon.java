package homework12;

public class Octagon extends Hexagone{
    public Octagon(double lengthe) {
        super(lengthe, lengthe);
    }

    @Override
    public void draw(){
        System.out.println("I draw Octagon with side="+length);
    }
}
