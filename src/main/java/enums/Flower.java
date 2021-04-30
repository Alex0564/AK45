package enums;

public class Flower extends Plant{
    private Buds[] buds;

    public Flower(String name, String color, int age){
        super(name, color, age);
    }
    public  void setBuds(Buds[] buds){
        this.buds = buds;
    }
    public Buds[] getBuds(){
        return buds;
    }
    public void printFlower(){
        System.out.println("Name = " + name + ", Color = " + color + ", Age = " + age);
    }

}
