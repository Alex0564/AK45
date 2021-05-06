package hw14;

public class model {
    private String complecs;
    private String year;

    public String getComplecs() {
        return complecs;
    }

    public void setComplecs(String complecs) {
        this.complecs = complecs;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public model(String complecs, String year) {
        this.complecs = complecs;
        this.year = year;
    }

    @Override
    public String toString() {
        return "model{" +
                "complecs='" + complecs + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
