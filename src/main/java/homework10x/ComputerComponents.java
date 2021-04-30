package homework10x;

public class ComputerComponents {
    protected String name;
    protected String brand;
    protected String model;
    protected int year;

    public ComputerComponents(String name, String brand, String model, int year) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
