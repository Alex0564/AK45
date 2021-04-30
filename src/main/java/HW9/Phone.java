package HW9;

public class Phone {
    private String brand;
    private String model;
    private int price;


    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }

}
