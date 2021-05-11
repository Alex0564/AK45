package ArtuomLesson12HWB;

public class LapTop implements  MILSTD810F{
    protected String brand;
    protected Colors Colors;
    protected int year;

    public LapTop(String brand, ArtuomLesson12HWB.Colors colors, int year) {
        this.brand = brand;
        Colors = colors;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArtuomLesson12HWB.Colors getColors() {
        return Colors;
    }

    public void setColors(ArtuomLesson12HWB.Colors colors) {
        Colors = colors;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void Donthitthelapttop() {
        System.out.println( brand+" "+Colors+" "+year+" Not suitable for driving nails ");

    }

    @Override
    public void Donotwasрthelaptopinthesink() {
        System.out.println(brand+" "+Colors+" "+year+" Not waterproof and should not be placed in water");


    }
}
