package practice;
/*
 Rule: Even though a subclass includes all the members of its superclass, it can not
 access those members of the superclass that have been declared private.  However,
 you can access them buy using accessor methods such as setters and getters.
 */

public class Flower {
    protected String name;
    private int year;        // private!!

    public Flower() {
    }

    @Override
    public String toString() {
        return "Flower: " +
                "name='" + name + '\'' +
                ", years=" + year;
    }

    public Flower(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        "\nYear: " + year);
    }

}