package hw9;

public class Tour {
    private String destination;
    private String season;
    private int week;
    private int cost;

    // Setters:

    // constructor:
    public Tour(String destination, String season, int week, int cost) {
        this.destination = destination;
        this.season = season;
        setWeek(week);
        setCost(cost);
    }

    // Default constructor:

    public Tour() {
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        if (week >= 12 || week <= 1) {
            throw new IllegalArgumentException("Wrong duration");
        }
        this.week = week;
    }
    // Getters:

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 24000 || cost <= 100) {
            throw new IllegalArgumentException("Wrong number");
        }
        this.cost = cost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    // printInfo method:

    public void printInfo() {
        System.out.println(
                "Your dream vacation to amazing " + destination + " during " + season +
                        " for " + week + " weeks is for only $" + cost + "! Hurry up!");
    }


}
