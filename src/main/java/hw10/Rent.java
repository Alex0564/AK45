package hw10;

public class Rent extends Car {
    private String period;

    public Rent() {
    }

    public Rent(String name, String model, String color, int year, String period) {
        super(name, model, color, year);
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}



