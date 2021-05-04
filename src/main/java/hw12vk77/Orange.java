package hw12vk77;

public class Orange implements IFruit {
    protected String sweetness;
    protected String color;

    public Orange(String sweetness, String color) {
        this.sweetness = sweetness;
        this.color = color;
    }

    @Override
    public void getRipeSign() {
        System.out.println("Orange's skin color become "+color);
    }

    @Override
    public void readyToEat() {
        System.out.println("Orange taste so good and sweetness very "+sweetness+", so it's definitely  ready to eat!");
    }


}
