package hw17;

public class Whales implements IMammals{
    protected String type;
    protected String name;

    public Whales(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void heterotrophs() {
        System.out.println("It eats living organisms for energy;");
    }

    @Override
    public void breath() {
        System.out.println("It can breath;");

    }

    @Override
    public void eat() {
        System.out.println("It eats by the mouth;");

    }

    @Override
    public void reproduce() {
        System.out.println("It can reproduce sexually;");

    }

    @Override
    public void die() {
        System.out.println("It can die...");

    }

    @Override
    public void warmBlooded() {
        System.out.println("It is a warm-blooded vertebrate;");

    }

    @Override
    public void internalSkeleton() {
        System.out.println("It has an internal skeleton;");

    }

    @Override
    public String toString() {
        return "Whales{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
