package life;

public class Herbivores implements Mammals{
    private String plant;
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void breathe() {
        System.out.println("I can breathe");

    }

    @Override
    public void eat() {
        System.out.println("I don't eat meat");

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
