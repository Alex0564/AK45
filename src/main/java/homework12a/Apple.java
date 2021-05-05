package homework12a;

public class Apple implements IFruits{
    public String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public void fruitName() {
        System.out.println("I am "+color+" apple. My price is "+price());
                }
    @Override
    public int price() {
        return 15;
    }
}
