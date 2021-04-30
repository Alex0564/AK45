package UmidaLesson10HW;

public class Cake extends Dessert{
    private String decoration;


    public Cake(String name, String flavor, int price, String decoration) {
        super(flavor, name, price);
        this.decoration = decoration;
    }

    public String getCakeInfo() {
        return getDessertInfo() + "\nDecoration = " + decoration;
    }
}
