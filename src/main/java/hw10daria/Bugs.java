package hw10daria;

public class Bugs extends Animal{
    private String wings;

    public Bugs(String name, String color, String size, String environment,String wings){
        super(name, color, size, environment);
        this.wings=wings;
    }

    public String getWings() { return wings; }

    public void setWings(String wings) { this.wings = wings; }
}
