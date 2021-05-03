package hw9daria;

public class Brand {
    private String name;
    private String origin;
    private String pricerange;

    public void setname(String Name){
        this.name=Name;
    }
    public String getName(){
        return name;
    }
    public void setOrigin (String origin){
        this.origin=origin;
    }
    public String getOrigin(){
        return origin;
    }
    public void setPricerange (String pricerange){
        this.pricerange=pricerange;
    }
    public String getPricerange(){
        return pricerange;
    }
    public void printInfo(){
        System.out.println("The name is "+name+" and the origin is "+origin+" and the price range is "+pricerange);
    }
    public Brand (String name, String Origin, String pricerange){
        this.name=name;
        this.origin=origin;
        this.pricerange=pricerange;
    }
}
