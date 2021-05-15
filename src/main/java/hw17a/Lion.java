package hw17a;

public class Lion extends Carnivores {

    private String lionsType;

    public Lion(String lionsType) {
        this.lionsType = lionsType;
    }

    public String getLionsType() {
        return lionsType;
    }

    public void setLionsType(String lionsType) {
        this.lionsType = lionsType;
    }

    @Override
    public void heterotrophs() {
        System.out.println("It eats living organisms for energy.");
    }

    @Override
    public void breath() {
        System.out.println("Lion: 'I can breath!!!'");

    }

    @Override
    public void eat() {
        System.out.println("It can eat by its mouth.");

    }

    @Override
    public void reproduce() {
        System.out.println("It can reproduce sexually.");

    }

    @Override
    public void die() {
        System.out.println("It can die...");

    }

    @Override
    public void warmBlooded() {
        System.out.println("It is a warm-blooded vertebrate.");

    }

    @Override
    public void internalSkeleton() {
        System.out.println("It has an internal skeleton.");

    }


    @Override
    protected void aggressive() {
        System.out.println("Lion: 'I can be very aggressive!'");

    }

    @Override
    public String toString() {
        return "Lion{" +
                "lionsType='" + lionsType + '\'' +
                '}';
    }
}
