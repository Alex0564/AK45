package hw17a;

public class BlueWhale extends Whales {

    private String whalesType;

    public String getWhalesType() {
        return whalesType;
    }

    public void setWhalesType(String whalesType) {
        this.whalesType = whalesType;
    }

    public BlueWhale(String whalesType) {
        this.whalesType = whalesType;
    }

    @Override
    public void heterotrophs() {
        System.out.println("Whale: 'My favorite food - tiny shrimp-like animals'.");
    }

    @Override
    public void breath() {
        System.out.println("Whale: 'I can breath too!!!'");

    }

    @Override
    public void eat() {
        System.out.println("It has very sharp teeth.");

    }

    @Override
    public void reproduce() {
        System.out.println("It can reproduce very often.");

    }

    @Override
    public void die() {
        System.out.println("It can unfortunately die...");

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
    protected void sing() {
        System.out.println("Whale: I love singing!");

    }

}
