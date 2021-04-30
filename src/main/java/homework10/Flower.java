package homework10;

public class Flower {
    protected String name;
    protected String color;
    protected int price;

    public Flower(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public String getInfo(){
        return this.color + " " +this.name +" is "+ this.price + " $";
    }

}


