package hw10vk77;

public class House {
    protected int rooms;
    protected int Bathroom;
    protected String Entrance;
    protected String Roof;

    public House() {
    }

    public House(int rooms, int bathroom, String entrance, String roof) {
        this.rooms = rooms;
        Bathroom = bathroom;
        Entrance = entrance;
        Roof = roof;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBathroom() {
        return Bathroom;
    }

    public void setBathroom(int bathroom) {
        Bathroom = bathroom;
    }

    public String getEntrance() {
        return Entrance;
    }

    public void setEntrance(String entrance) {
        Entrance = entrance;
    }

    public String getRoof() {
        return Roof;
    }

    public void setRoof(String roof) {
        Roof = roof;
    }
}
