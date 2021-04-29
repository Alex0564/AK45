package lesson9hw;

public class Vegetable {
    public String name;
    public VegetableColor color;
    public Vegetable(String name){
        this.name = name;
    }
    public Vegetable (VegetableColor color){
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Vegetable = "+name+" "+color);
    }
    public Vegetable(){}
    public void setName(String name){
        this.name = name;
    }



}
