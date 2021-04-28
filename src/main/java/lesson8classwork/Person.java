package lesson8classwork;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public void start(){ System.out.println("Start = " + name + " - " + lastName); }
    public void finish(int x) {
        name = name + x;
        System.out.println("new name - " + name);
    }
    public String info(){
        int ya = 2021-year;
        return "inform about person: " + this.name + "\n" + this.lastName + "\n" + ya + " years old\n";
    }
}
