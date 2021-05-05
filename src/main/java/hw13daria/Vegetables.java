package hw13daria;

public class Vegetables {
    private String name;
    private String size;
    private String color;
    private String season;
    private String popularity;

    public Vegetables (String name, String size, String color, String season, String popularity){
        this.name=name;
        this.size=size;
        this.color=color;
        this.season=season;
        this.popularity=popularity;
    }

    public void setName (String name) { this.name=name; }
    public String getName() { return name; }
    public void setSize (String size) {this.size=size;}
    public String getSize( ){return size;}
    public void setColor(String color){this.color=color;}
    public String getColor(){return color;}
    public void setSeason(String season){this.season=season;}
    public String getSeason(){return season;}
    public void setPopularity(){this.popularity=popularity;}
    public String getPopularity() {return popularity; }

}
