package hw9daria;

public class Pet {
    private String kind;
    private String gender;
    private String Fur;
    private String name;

    public void setkind (String kind){
        this.kind=kind;
    }
    public String getkind(){
        return kind;
    }
    public void setFur (String Fur){
        this.Fur=Fur;
    }
    public String getFur(){
        return Fur;
    }
    public void setname (String name){
        this.name=name;
    }
    public String getname(){
        return name;}
    public void setgender (String gender){
        this.gender=gender;
    }
    public String getgender(){
        return gender;
    }
    public void printInfo(){
        System.out.println("The kind of animal is "+kind+" and the gender is "+gender+". The fur is"+Fur+" and the name is "+name+".");
    }

}
