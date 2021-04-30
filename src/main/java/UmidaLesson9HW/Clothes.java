package UmidaLesson9HW;

public class Clothes {
    private int size;
    private String color;
    private String style;

//create default constructor
    public Clothes() {}

//create full constructor
    public Clothes(String color, int size, String style) {
        this.color = color;
        this.style = style;
        this.size = size;
    }

//getter and setter
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    public String getStyle(){
        return style;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize(){
        return size;
    }
 //end of getter and setter


//printClass method
    public void printInfo() {
        System.out.println("Clothes{" +
                "style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}');
    }
}
