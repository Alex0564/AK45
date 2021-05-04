package inter;

public class Pear implements IFruit{
    private String color;
    private int time;

    public Pear(String color, int time) {
        this.color = color;
        this.time = time;
    }

    @Override
    public void eat() {
        System.out.println("I don't eat pear");
    }

    @Override
    public int cook() {
        return time;
    }

    @Override
    public void collect() {
        System.out.println("Mom collects pears two hours");

    }
}
