package homework12x;

public class Parallelepiped implements IVolumetricFigures{
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I draw Parallelepiped");

    }

    @Override
    public double getVolume() {
        return length*width*height;
    }

}
