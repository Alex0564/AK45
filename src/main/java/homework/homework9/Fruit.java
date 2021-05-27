package homework.homework9;

public class Fruit {
    private String name;
    private String color;
    private String taste;

    public Fruit (String name, String color, String taste){
        this.name = name;
        this.color = color;
        this.taste = taste;
    }
    public Fruit (){}

    public void setName (String name) {this.name = name;}
    public String getName () {return name;}
    public void setColor (String color) {this.color = color;}
    public String getColor() {return color;}
    public void setTaste (String taste) {this.taste = taste;}
    public String getTaste () {return taste;}

    public void printFruitInfo (){
        System.out.println("Fruit{Name - "+name+", Color - "+color+", Taste - "+taste+"}");
    }
}
