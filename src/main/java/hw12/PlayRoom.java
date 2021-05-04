package hw12;

public class PlayRoom implements Room {
    private final double length;
    private final double width;
    private final double height;

    public PlayRoom(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("It looks like we will paint our playroom also!");

    }

    @Override
    public void color() {
        System.out.println("Warm yellow is perfect for it!");

    }

    @Override
    public double getSquareFootage() {
        return 2 * height * (length + width) / 200;
    }

    @Override
    public void floorCover() {
        System.out.println("The playroom's carpet needs to be replaced!");


    }

    @Override
    public double getFloorsArea() {
        return length * width;
    }
}
