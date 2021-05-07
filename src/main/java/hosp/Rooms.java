package hosp;

public class Rooms {
    private String nameRooms;

    public Rooms(String nameRooms) {
        this.nameRooms = nameRooms;
    }

    public String getNameRooms() {
        return nameRooms;
    }

    public void setNameRooms(String nameRooms) {
        this.nameRooms = nameRooms;
    }

    @Override
    public String toString() {
        return nameRooms;
    }
}
