package hw9daria;

public class Glasses {
    private String type;
    private String color;
    private String gender;

    public void settype (String type){
        this.type=type;
    }
    public String gettype(){
        return type;
    }
    public void setcolor (String color){
        this.color=color;
    }
    public String getcolor(){
        return color;
    }
    public void printInfo(){
    System.out.println("The type of Glasses is "+type+" and the color is "+color);
    }
}