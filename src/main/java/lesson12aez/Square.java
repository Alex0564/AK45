package lesson12aez;

public class Square extends Rectangle{
    public Square(double length) {
        super(length, length);
    }
    @Override
    public void draw(){
        System.out.println("I draw Square with side = "+length);
    }
}
