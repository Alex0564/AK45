package UmidaLesson8HW;

public class Pastry {
    public String name;
    public String filling;
    public int price;

    public void get() {
        System.out.println("I guess dozen of "+filling+" filled "+name+
                " for "+12*price+" dollars will be good for the breakfast");
    }
}
