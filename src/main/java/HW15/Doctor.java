package HW15;

public class Doctor {
private String name;
private String lastName;
private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

//    public String getDoctors(){
//        return "Doctror - "+name+" "+lastName+"-"+position;
//    }
    public void getDoctors(){
        System.out.println("Doctror - "+name+" "+lastName+"-"+position);
    }
}