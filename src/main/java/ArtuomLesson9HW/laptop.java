package ArtuomLesson9HW;

public class laptop {
    private String Brand;
    private int year;
    private String Color;
    private int memory;

    public laptop(String brand, int year, String color, int memory) {
        Brand = brand;
        this.year = year;
        Color = color;
        this.memory = memory;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public laptop() {

    }
    public  void printClass(){
        System.out.println(this.Brand+" "+this.Color+"  "+this.year+"  "+this.memory);

    }
}
