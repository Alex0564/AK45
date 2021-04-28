package lesson8hw;

public class TShirt {
    public String brand;
    public String style;
    public String size;
    public String color;
    public double price;

    public void printTshirtInfo(){
        System.out.println("T-shirt brand = "+brand+"\nStyle = "+style+"\nColor = "+color+"\nPrise = $"+price);
    }
    public String getInfo(){
        return "Brand = "+brand+" Color = "+color+" Price =$"+price;
    }


}
