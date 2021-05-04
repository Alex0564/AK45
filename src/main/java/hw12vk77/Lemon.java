package hw12vk77;

public class Lemon extends Orange{
    private String skinThin;

    public Lemon(String sweetness, String color, String skinThin) {
        super(sweetness, color);
        this.skinThin = skinThin;
    }

    public String getSkinThin() {
        return skinThin;
    }

    @Override
    public void getRipeSign() {
        System.out.println("Lemon's skin color become "+color+ " and taste very "+ sweetness);
    }

    @Override
    public void readyToEat() {
        System.out.println("Lemon taste so strange and sourness very "+sweetness+", so it's definitely  ready to eat!");
    }
}
