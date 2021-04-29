package homework9;

public class Beer {
    private String name;
    private String type;
    private int price;

    public Beer(String name, String type, int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public Beer(){}

    public void setPrice(int p){
        price = p;
    }
    public int getPrice() {
        return price;
    }
    public void printInfo(){
        System.out.println("Beer{" +
                "name='" + name + '\'' +
                ", type ='" + type + '\'' +
                ", price=" + price +
                '}');
    }
}
