package life;

public class Rodents implements Mammals{
    private String food;
    @Override
    public void move() {
        System.out.println("I can run fast");
    }

    @Override
    public void breathe() {
        System.out.println("I can breathe");

    }

    @Override
    public void eat() {
        System.out.println("I eat grain");

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
        System.out.println("I don't feed my children milk");

    }

    @Override
    public void vertebrates() {
        System.out.println("I have a spine");

    }
}
