package UmidaLesson10HW;

public class IceCream extends Dessert {
    private String topping;


    public IceCream(String name, String flavor, int price, String topping) {
        super(flavor, name, price);
        this.topping = topping;
    }

    public String getIceCreamInfo() {
        return getDessertInfo() + "\nTopping = " + topping;
    }
}
