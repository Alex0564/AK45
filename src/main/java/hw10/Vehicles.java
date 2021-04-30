package hw10;

public class Vehicles {

    protected String make;
    protected String model;
    protected int year;
    protected exteriorColors exteriorColors;

    public Vehicles() {

    }

    public Vehicles(String make, String model, int year, hw10.exteriorColors exteriorColors) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.exteriorColors = exteriorColors;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public hw10.exteriorColors getExteriorColors() {
        return exteriorColors;
    }

    public void setExteriorColors(hw10.exteriorColors exteriorColors) {
        this.exteriorColors = exteriorColors;
    }
}
