package hw10daria;

public class Animal {
    protected String name;
    protected String color;
    protected String size;
    protected String environment;

    public Animal (String name, String color, String size, String environment){
        this.name=name;  this.color=color; this.size=size; this.environment=environment;}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getSize() { return size; }

    public void setSize(String size) { this.size = size; }

    public String getEnvironment() { return environment; }

    public void setEnvironment(String environment) { this.environment = environment; }
}
