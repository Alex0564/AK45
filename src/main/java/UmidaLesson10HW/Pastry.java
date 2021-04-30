package UmidaLesson10HW;

public class Pastry extends Dessert{
    private String filling;


    public Pastry(String name, String flavor, int price, String filling) {
        super(flavor, name, price);
        this.filling = filling;
    }

    public String getPastryInfo() {
        return getDessertInfo() + "\nFilling = " + filling;
    }
}
