package hw14;

public class make {
    private String color;
    private String year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "make{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public make(String color, String year) {
        this.color = color;
        this.year = year;
    }
}
