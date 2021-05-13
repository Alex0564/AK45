package life;

public class Carnivores implements Mammals{
    protected String place;

    public Carnivores(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

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
        System.out.println("I can eat");

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
