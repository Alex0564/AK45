package less9homework;

public class apartment {
    private int house;
    private int apt;
    private String street;
    public apartment (){}
    public apartment (int house, int apt, String street){
        this.house = house;
        this.apt = apt;
        this.street = street;
    }
    public void setApt(int apt) {this.apt = apt;}
    public void setHouse(int house){this.house = house;}
    public void setStreet(String street){this.street = street;}


}
