package HW10;

public class Forward extends Goalkeeper{
    private String captain;

    public Forward(String name, String nationality, Pos position, int shirtNumber, String captain){
        super(name, nationality,position,shirtNumber);
        this.captain=captain;
    }

    public String getFwInfo(){
        return getKeeperInfo()+"\n"+captain;
    }




}
