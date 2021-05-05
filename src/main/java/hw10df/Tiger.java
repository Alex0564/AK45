package hw10df;

public class Tiger extends Animal{
    private final Color color;


    public Color getColor() {
        return color;
    }

    public Tiger(Color color) {
        this.color = color;
    }

    public Tiger(String name, String kind, int year, Color color) {
        super(name, kind, year);
        this.color = color;


    }


    public hw10df.Gender getGender() {
        return super.getGender();
    }

    public Tiger(String name, String kind, int year, Object gender, Color color) {
        super(name, kind, year, gender);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", year=" + year +
                ", Gender=" + Gender +
                ", color=" + color +
                '}';
    }

}
