package enums;

public class Plant {
    protected String name;
    protected String color;
    protected int age;

    public Plant(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Plant(){}

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public void printPlant(){
        System.out.println("Name = " + name + ", Color = " + color + ", Age = " + age);
    }
}
