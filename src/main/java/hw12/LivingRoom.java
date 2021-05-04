package hw12;

public class LivingRoom extends Bedroom {
    public LivingRoom(double length, double height) {
        super(length, length, height);
    }

    @Override
    public void paint() {
        System.out.println("We will paint our living room too!");
    }

    @Override
    public void color() {
        System.out.println("So, we have chosen neutral green color!");

    }


}
