package ArtuomLesson10HW;

public class Bike extends  Transport{
    private Colors Colors;

    public Bike(String Type, String Brand, int year, Colors Colors) {

        super(Type,Brand,year);

        this.Colors = Colors;


    }

    public ArtuomLesson10HW.Colors getColors() {
        return Colors;
    }

    public void setColors(ArtuomLesson10HW.Colors colors) {
        Colors = colors;
    }
}
