package life;

public class Seals implements Mammals{
    private Water water;
    @Override
    public void move() {
        System.out.println("I swim in the water");
    }

    @Override
    public void breathe() {
        System.out.println("I breathe underwater");

    }

    @Override
    public void eat() {
        System.out.println("I eat marine animals and plants");

    }

    @Override
    public void reproduce() {
        System.out.println("I can reproduce");

    }

    @Override
    public void die() {
        System.out.println("I could die");

    }

    @Override
    public void mammals() {
        System.out.println("I feed my children milk");

    }

    @Override
    public void vertebrates() {
        System.out.println("I have a spine");

    }
}
