package hw10vk77;

public class Aptbuilding  extends House{
    private int floors;
    private int Aptamount;
    private boolean Elevator;

    public Aptbuilding() {
    }

    public Aptbuilding(int floors, int aptamount, boolean elevator) {
        this.floors = floors;
        Aptamount = aptamount;
        Elevator = elevator;
    }

    public Aptbuilding(int rooms, int bathroom, String entrance, String roof, int floors, int aptamount, boolean elevator) {
        super(rooms, bathroom, entrance, roof);
        this.floors = floors;
        Aptamount = aptamount;
        Elevator = elevator;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getAptamount() {
        return Aptamount;
    }

    public void setAptamount(int aptamount) {
        Aptamount = aptamount;
    }

    public boolean isElevator() {
        return Elevator;
    }

    public void setElevator(boolean elevator) {
        Elevator = elevator;
    }
}
