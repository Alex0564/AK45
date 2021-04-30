package HW10;

public class Goalkeeper extends Coach{
    protected String name;
    protected String nationality;
    protected Pos position;
    protected int shirtNumber;

    public Goalkeeper(){}


    public Goalkeeper(String name, String nationality, Pos position, int shirtNumber){
        super(name, nationality, position);
        this.shirtNumber=shirtNumber;
    }
    public String getKeeperInfo(){
        return getCoachInfo()+"\nShirt# - "+shirtNumber;
    }

}
