package life;

public class Primates implements Mammals{
    private String name;
    @Override
    public void move() {
        System.out.println("I can jump");
    }

    @Override
    public void breathe() {
        System.out.println("I can breathe");

    }

    @Override
    public void eat() {
        System.out.println("I love eating bananas");

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
