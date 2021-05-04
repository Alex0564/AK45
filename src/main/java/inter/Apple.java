package inter;

public class Apple implements IFruit{
    protected String taste;
    protected int time;

    public Apple(String taste, int time) {
        this.taste = taste;
        this.time = time;
    }

    @Override
    public void eat() {
        System.out.println("I am eating an apple");
    }

    @Override
    public int cook() {
        return time;
    }


    @Override
    public void collect() {
        System.out.println("Grandma collects on hour");
    }
}
