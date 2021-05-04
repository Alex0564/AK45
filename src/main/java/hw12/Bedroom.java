package hw12;

public class Bedroom implements Room {
    protected double length;
    protected double width;
    protected double height;

    public Bedroom(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("We have decided to paint our bedroom!");

    }

    @Override
    public void color() {
        System.out.println("So, we have chosen cool blue color!");

    }

    @Override
    public double getSquareFootage() {
        return 2 * height * (length + width) / 200;
    }

    @Override
    public void floorCover() {
        System.out.println("So, let's recover our floor!");

    }

    @Override
    public double getFloorsArea() {
        return length * width;
    }
}
