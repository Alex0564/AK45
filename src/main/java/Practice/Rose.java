package Practice;

// The goal is to inherit a class without using one of the member of superclass


public class Rose extends Flower {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
     this constructor does not contain access to the private member
     of the superclass such as int year
     */

    public Rose(String name, String color) {
        super(name);
        this.color = color;

    }

    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        "\nColor: " + color);
    }

}








