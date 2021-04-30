package UmidaLesson9HW;

public class Font {
    private String name;
    private int size;
    private String color;

//create default constructor
    public Font(){}

//create full constructor
    public Font(String name, String color, int size) {
        this.color  = color;
        this.name = name;
        this.size = size;
    }

//getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//end of getter and setter

    //printClass method
    public void printInfo() {
        System.out.println("Clothes{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}');
    }

}
