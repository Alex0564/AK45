package hw9;

public class Home {
    private String location;
    private String style;
    private int buildYear;
    private int bedroom;

    // Setters:

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setBuildYear(int buildYear) {
        if (buildYear > 2021 || buildYear < 1890) {
            throw new IllegalArgumentException("Wrong year");
        }
        this.buildYear = buildYear;
    }

    public void setBedroom(int bedroom) {
        if (bedroom > 100 || bedroom <= 1) {
            throw new IllegalArgumentException("Wrong bedroom's number");
        }
        this.bedroom = bedroom;
    }
    // Getters:

    public int getBedroom() {
        return bedroom;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public String getLocation() {
        return location;
    }

    public String getStyle() {
        return style;
    }
    // printInfo method:

    public void printInfo() {
        System.out.println(
                "Location = '" + location + '\'' +
                        ", style = '" + style + '\'' +
                        ", build year = " + buildYear + ", " +
                        "number of bedrooms = " + bedroom);
    }

    // constructor:
    public Home(String location, String style, int buildYear, int bedroom) {
        this.location = location;
        this.style = style;
        setBuildYear(buildYear);
        this.bedroom = bedroom;
    }

    // default constructor:

    public Home() {
    }
}
