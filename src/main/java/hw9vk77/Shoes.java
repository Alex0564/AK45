package hw9vk77;

public class Shoes {
    private String shoeType;
    private String shoeBrand;
    private String shoeColor;
    private double shoeSize;
    private Double price;
    private  String purpose; //running, basketball, tennis etc


    //GET SET
    public String getShoeType() {
        return shoeType;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }


    // CONSTRUCTORS DEFAULT AND FULL
    public Shoes(){}
    public Shoes(String shoeType, String shoeBrand, String shoeColor, double shoeSize, Double price, String purpose) {
        this.shoeType = shoeType;
        this.shoeBrand = shoeBrand;
        this.shoeColor = shoeColor;
        this.shoeSize = shoeSize;
        this.price = price;
        this.purpose = purpose;
    }

    //Method
    public void printClass(){
        System.out.println("Dog{" +
                "shoeType='" + shoeType + '\'' +
                ", shoeBrand='" + shoeBrand + '\'' +
                ", shoeColor='" + shoeColor + '\'' +
                " shoeSize='" + shoeSize + '\'' +
                ", price='" + price + '\'' +
                ", purpose='" + purpose +
                '}');
    }
}
