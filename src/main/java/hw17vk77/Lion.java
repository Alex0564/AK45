package hw17vk77;

public class Lion extends Carnivores{
private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void hasSpine() {

    }

    @Override
    public void canBreath() {
        System.out.println("Lion can breathe!");
    }

    @Override
    public void canEat() {
        System.out.println("I am "+name+" and I Can eat every Zebra in Africa!!!");

    }

    @Override
    public void canDie() {

    }

    @Override
    public void canReproduct() {
        System.out.println("I am looking for lioness!");

    }

    @Override
    public void hasEukaryota() {

    }

    @Override
    public void feedMilk() {

    }
}
