package hw17vk77;

public class Wolf extends Carnivores{
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public void canBreath() {

    }

    @Override
    public void canEat() {
        System.out.println("I am "+name+" and I Can eat Mooses!");
    }

    @Override
    public void canDie() {
        System.out.println("CAN DIE!");
    }

    @Override
    public void canReproduct() {
        System.out.println("Reproduct 3 child");
    }

    @Override
    public void hasSpine() {

    }

    @Override
    public void hasEukaryota() {

    }

    @Override
    public void feedMilk() {

    }
}