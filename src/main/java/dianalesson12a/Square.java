package dianalesson12a;

public class Square extends Rectangle {
    public Square(double length){
        super(length, length);
    }

    public void draw(){
        System.out.println("I draw Square");
    }
}
