package less15homework;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor() {}

    public Doctor(String lastName) {
        this.lastName = lastName;
    }

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor " + name + " " + lastName + " position: " + position;}
    public void printDoctors(){
        System.out.println("Doctor "+this.name+" "+this.lastName+" position: "+ this.position); }


}
