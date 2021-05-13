package hw17;

public class Carnivores implements IMammals{
    protected String type;
    protected String name;

    public Carnivores(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Carnivores(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String type) {
        this.type = type;
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
        System.out.println("It can eat by its mouth;");

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
        return "Carnivores{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
