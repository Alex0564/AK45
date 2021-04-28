package hw8;

public class Tour {

    public String destination;
    public String season;
    public int week;
    public int cost;

    public void tourCost() {
        System.out.println("A tour to " + destination + " for " + week + " weeks will cost you only $" + cost + "!");
    }
}
