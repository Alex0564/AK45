package UmidaLesson10HW;

public class Dessert {
    protected String name;
    protected int price;
    protected String flavor;

    public Dessert() {}

    public Dessert(String name, String flavor, int price) {
        this.flavor = flavor;
        this.name = name;
        this.price = price;
    }

    public String getDessertInfo(){
        return "Name = " + this.name + "\nflavor = " + this.flavor + "\nprice = " + this.price;
    }
}



