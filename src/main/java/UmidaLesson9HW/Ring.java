package UmidaLesson9HW;

public class Ring {
    private String gem;
    private String manufacturer;
    private int price;
    private String name;

//create default constructor
    public  Ring(){}

//create full constructor
    public Ring(String gem, String manufacturer, int price, String name) {
        this.gem = gem;
        this.manufacturer = manufacturer;
        this.price = price;
        this.name = name;
    }

//setter and getter
    public String getGem() {
        return gem;
    }

    public void setGem(String gem) {
        this.gem = gem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//end of setter and getter

//printClass method
public void printInfo() {
    System.out.println("Clothes{" +
            "price='" + price + '\'' +
            ", name='" + name + '\'' +
            ", manufacturer=" + manufacturer + '\'' +
            ", gem=" + gem + '\'' +
            '}');
}
}

