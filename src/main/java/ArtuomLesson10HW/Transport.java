package ArtuomLesson10HW;

public class Transport {
    protected String  Type;
    protected String Brand;
       protected int year;

    public Transport(String type, String brand, int year) {
        Type = type;
        Brand = brand;
        this.year = year;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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
}
