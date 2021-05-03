package hw10;

public class Sale extends Car{
    private int discount;

    public Sale() {
    }

    public Sale(String name, String model, String color, int year, int discount) {
        super(name, model, color, year);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
