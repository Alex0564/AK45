package homework.homework9;

public class Tires {
    private String brand;
    private String season;
    private int diameter;

    public Tires (String brand, String season, int diameter){
        this.brand = brand;
        this.season = season;
        this.diameter = diameter;
    }

    public Tires(){}

    public void setBrand (String brand) { this.brand = brand; }
    public String getBrand () { return brand; }
    public void setSeason (String season) { this.season = season; }
    public  String getSeason () {return  season; }
    public void setDiameter (int diameter) { this.diameter = diameter; }
    public int getDiameter () {return diameter; }

    public void printInfo(){
        System.out.println("Tires{"+"Brand - "+brand+", Season - "+season+", Diameter - "+diameter+"}");
    }


}
