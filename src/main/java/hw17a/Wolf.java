package hw17a;

public class Wolf extends Carnivores {

    private String wolfsType;

    public Wolf(String wolfsType) {
        this.wolfsType = wolfsType;
    }

    public String getWolfsType() {
        return wolfsType;
    }

    public void setWolfsType(String wolfsType) {
        this.wolfsType = wolfsType;
    }

    @Override
    public void heterotrophs() {
        System.out.println("It eats other animals.");
    }

    @Override
    public void breath() {
        System.out.println("Wolf: 'I can breath too!!!'");

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
        System.out.println("Wolf: 'I am aggressive, but not so much!'");

    }

    @Override
    public String toString() {
        return "Wolf{" +
                "wolfsType='" + wolfsType + '\'' +
                '}';
    }
}
