package hw9ab;

public class Cat {
    private String name;
    private String color;
    private String fur;


    public Cat(String name, String color, String fur) {
        this.name = name;
        this.color = color;
        this.fur = fur;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


}