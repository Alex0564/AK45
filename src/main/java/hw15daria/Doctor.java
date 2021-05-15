package hw15daria;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    //getters
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public Position getPosition() { return position; }

    //setters
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPosition (Position position){
        this.position=position;
    }

    public String print_info(){
        return "Doctor: "+
                "\nName= "+name+
                "\nLast Name: "+ lastName+
                "\nPosition: "+ position;
    }

}
