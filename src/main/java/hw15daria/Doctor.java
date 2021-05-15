package hw15daria;

public class Doctor {
    private String name;
    private String lastName;
    private Position.position position;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Position.position getPosition() { return position; }

    public Doctor(String name, String lastName, Position.position position) { this.name = name;
        this.lastName = lastName;this.position = position; }

// it was created for the d.doctors
    public boolean printDoctors (){ System.out.println( "Doctor's name is: "+ this.name+" and last name is: "+this.lastName+
        ". "+"Doctor's title is: "+this.position+".");
        return false;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}
