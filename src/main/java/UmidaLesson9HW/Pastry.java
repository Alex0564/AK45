package UmidaLesson9HW;

public class Pastry {
    private String name;
    private String filling;
    private int price;

//create default constructor
    public Pastry() {}

//create full constructor
    public Pastry(String name, String filling, int price) {
        this.filling = filling;
        this.name = name;
        this.price = price;
    }

//getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//end of getter and setter

//printClass method
    public void printInfo() {
        System.out.println("Clothes{" +
                "price='" + price + '\'' +
                ", name='" + name + '\'' +
                ", filling=" + filling +
                '}');
    }
}

