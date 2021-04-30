package HW10;

public class Midfielder extends Goalkeeper{
    private String injury;

    public Midfielder(String name, String nationality, Pos position, int shirtNumber, String injury){
        super(name, nationality, position, shirtNumber);
        this.injury=injury;
    }

    public String getMidInfo(){
        return getKeeperInfo()+"\n"+injury;
    }
}
