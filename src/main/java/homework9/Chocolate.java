package homework9;

public class Chocolate {
    private String name;
    private String type;
    private int price;

    public Chocolate(int price){
        this.price = price;
    }
    public Chocolate(){}

    public void setName(String name){
        this.name = name;
    }
    public void setType(String t){
        type = t;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public void printInfo(){
        System.out.println("Chocolate{" +
                "name='" + name + '\'' +
                ", type ='" + type + '\'' +
                ", price=" + price +
                '}');
    }

}
