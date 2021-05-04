package lesson12avk77;

public class Square extends Rectangle{
    public Square(double length) {
        super(length, length);
    }
    @Override
    public void draw(){
        System.out.println("I draw square with side ="+length);
    }
}
