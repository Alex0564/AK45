package hw9ab;

public class Computer {
    private String name;
    private int year;
    private String color;


    public void setColor(String color) {
        this.color = color;
    }
    public void getColor(String color){
        this.color=color;
    }
    public void printInfo() {
        System.out.println("Computer{" + "color=" + color + '}');
    }
}
