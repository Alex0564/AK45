package HW10;

public class Defender extends Goalkeeper{
    public Defender(String name, String nationality, Pos position, int shirtNumber){
        super(name,nationality,position,shirtNumber);

    }
    public String getDefInfo(){
        return getKeeperInfo();
    }

    }



