package UmidaLesson12HW;

public class Mercedes extends Tesla{
    private int year;

    public Mercedes(String model, String color, int year){
        super(model, color);
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    @Override
    public void acceleration() {
        System.out.println(color+" "+model+" can exceed the speed of 100 horses.");
    }

    @Override
    public void emergencyWarning() {
        System.out.println(color+" "+model+" offers modern airbags.");
    }
}
