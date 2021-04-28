package hw8vk77;

public class Shoes {
    public String shoeType;
    public String shoeBrand;
    public String shoeColor;
    public double shoeSize;
    public Double price;
    public String purpose; //running, basketball, tennis etc

    public void GetInfo(){

        System.out.println("This store can suggest you very popular shoes " + this.shoeType+ " "+ this.shoeBrand +" brand");
        System.out.println("Right now very popular " + this.shoeColor+" snickers "+ this.shoeSize+" sizes for "+ this.purpose+" and it cost only $"+ this.price);
    }
}
