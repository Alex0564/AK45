package less9homework;

public class beverage {
    private String name;
    private Double volume;
    private String bottle;
    public beverage (){}
    public beverage(String name, Double volume, String bottle){
        this.name = name;
        this.volume = volume;
        this.bottle = bottle;
    }
    public void setName(String name){this.name = name;}
    public void setVolume(Double volume){this.volume = volume;}
    public void setBottle(String bottle){this.bottle = bottle;}
    public String getName(){return name;}
    public Double getVolume(){return volume;}
    public String getBottle(){return bottle;}







}
