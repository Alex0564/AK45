package hw12vk77;

public class Apple implements IFruit {
    private String color;
    private String newname="apple";
    public Apple(String color) {
        this.color = color;
    }

    public Apple(String color, String newname) {
        this.color = color;
        this.newname = newname;
    }

    @Override
    public void getRipeSign() {
        System.out.println(newname+" become big and smells very nice. And color is: "+color);
    }

    @Override
    public void readyToEat() {
        System.out.println(color+" "+newname+" smells very good and ready to eat!");
    }
}
