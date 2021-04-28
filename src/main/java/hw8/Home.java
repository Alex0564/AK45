package hw8;

public class Home {

    public String location;
    public String style;
    public int buildYear;
    public int story;
    public int bedroom;
    public String exteriorColor;
    public int price;

    public void homeCost() {
        System.out.println("A house in " + location + " in " + style + " style with " + bedroom + " bedrooms costs $" + price);
    }


}
