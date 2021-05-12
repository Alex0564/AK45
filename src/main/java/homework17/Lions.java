package homework17;

public class Lions extends Carnivores implements IMammals{
    @Override
    public void canBreath() {
        System.out.println("can breath");
    }

    @Override
    public void move() {
        System.out.println("can move");
    }

    @Override
    public void canEat() {
        System.out.println("can eat");
    }

    @Override
    public void canReproduce() {
        System.out.println("can reproduce");
    }

    @Override
    public void spine() {
        System.out.println("have spine");
    }

    @Override
    public void feedMilk() {
        System.out.println("feed newborn with milk");
    }
    private String name;

    public Lions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
