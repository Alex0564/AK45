package enums;

public class Wood extends Plant {
    private Blossom blossom;

    public Wood(String name, String color, int age, Blossom blossom){
        super(name, color, age);
        this.blossom = blossom;
    }
    public Wood(){}

    public void setBlossom(Blossom blossom){
        this.blossom = blossom;
    }
    public Blossom getBlossom(){
        return blossom;
    }
    public void printWood(){
        System.out.println("Name = " + name + ", Color = " + color + ", Age = " + age + ", Blossom = " + blossom);
    }

}
