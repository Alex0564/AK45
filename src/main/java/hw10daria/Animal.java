package hw10daria;

public class Animal {
    protected String name;
    protected String color;
    protected String size;
    protected String environment;
//    added another field
    protected String fur;
//    added enum paws
    protected paws paws;

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

//new constructor after adding field fur
//    public Animal(String name, String color, String size, String environment, String fur) {
//        this.name = name;
//        this.color = color;
//        this.size = size;
//        this.environment = environment;
//        this.fur = fur;
//    }
//    public String getFur() { return fur; }
//    public void setFur(String fur) { this.fur = fur; }

//    new constructor after adding enum paws

    public Animal(String name, String color, String size, String environment, String fur,  paws paws) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.environment = environment;
        this.fur = fur;
        this.paws=paws;
    }
    public paws getPaws() {return paws; }
    public void setPaws(hw10daria.paws paws) { this.paws = paws; }

}
