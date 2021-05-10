package hw15;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor (String name, String lastName,Position position){
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }
    public String getName(String name){
        return name;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    public Position getPosition(Position position){
        return position;
    }

    @Override
    public String toString() {
        return "Doctor " + name + " "+ lastName + '\n'+ position ;
    }

    public void printInfoDoctors(String printInfoDoctors){
        System.out.println("Doctor "+name+" "+lastName+". "+position+". ");


    }
}
