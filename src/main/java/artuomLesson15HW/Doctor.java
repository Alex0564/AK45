package artuomLesson15HW;



public class Doctor {
    private String name;
    private String lastName;
    private Position position;
    private RoomsNames roomsNames;

    public Doctor(String name, String lastName, Position position, RoomsNames roomsNames) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.roomsNames = roomsNames;
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

    public RoomsNames getRoomsNames() {
        return roomsNames;
    }

    public void setRoomsNames(RoomsNames roomsNames) {
        this.roomsNames = roomsNames;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", roomsNames=" + roomsNames +
                '}';
    }

    public void printDoctors() {
        System.out.println("This is doctors- " + name + " " + " His Last name is- " + lastName + " " + " His Position- " + position + " " + "  Follow him to his room# "+roomsNames);

    }
}
