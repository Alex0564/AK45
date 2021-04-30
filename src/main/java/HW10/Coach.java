package HW10;

public class Coach {
    protected String name;
    protected String nationality;
    protected Pos position;



public Coach(){}

//    public void setName(String name){this.name=name;}
//    public void setNationality(String nationality){this.nationality=nationality;}
//    public void setPos(Pos position){this.position=position;}
//
//    public String getName(){return name;}
//    public String getNationality(){return nationality;}
//    public Pos getPosition(){return position;}

    public Coach(String name, String nationality, Pos position){
        this.name=name;
        this.nationality=nationality;
        this.position=position;
    }

    public String getCoachInfo(){
        return "Name - "+this.name+"\nNationality - "+this.nationality+"\nPosition - "+this.position;
    }

}
