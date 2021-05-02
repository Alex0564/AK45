package UmidaLesson10HWEnums;

public class Moisturizer {
    public String brand;
    public String type;
    public int price;
    public SPF SPF;

    public Moisturizer(String brand, String type, int price, SPF SPF) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.SPF = SPF;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SPF getSPF() {
        return SPF;
    }

    public void setSPF(SPF SPF) {
        this.SPF = SPF;
    }
}
