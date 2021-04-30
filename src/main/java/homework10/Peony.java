package homework10;

public class Peony extends Flower {
    private AmountAvailableForSale inStock;

    public Peony(String name, String color, int price, AmountAvailableForSale inStock) {
        super(name, color, price);
        this.inStock = inStock;
    }
    public AmountAvailableForSale getInStock() {
        return inStock;
    }
    public void setInStock(AmountAvailableForSale inStock) {
        this.inStock = inStock;
    }
    public String printInfo(){
        return "Avaliable in store" + " " +this.inStock;
    }
}

