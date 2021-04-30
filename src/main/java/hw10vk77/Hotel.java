package hw10vk77;

public class Hotel extends Aptbuilding{
    private String Atrium;
    private String Laundry;
    private int Elevatoramount;
    private String Restorant;
    private String Pool;
    private String Gym;

    public Hotel() {
    }

    public Hotel(int rooms, int bathroom, String entrance, String roof, int floors, int aptamount, boolean elevator) {
        super(rooms, bathroom, entrance, roof, floors, aptamount, elevator);
    }

    public Hotel(int rooms, int bathroom, String entrance, String roof, int floors, int aptamount, boolean elevator, String atrium, String laundry, int elevatoramount, String restorant, String pool, String gym) {
        super(rooms, bathroom, entrance, roof, floors, aptamount, elevator);
        Atrium = atrium;
        Laundry = laundry;
        Elevatoramount = elevatoramount;
        Restorant = restorant;
        Pool = pool;
        Gym = gym;
    }

    public Hotel(String atrium, String laundry, int elevatoramount, String restorant, String pool, String gym) {
        Atrium = atrium;
        Laundry = laundry;
        Elevatoramount = elevatoramount;
        Restorant = restorant;
        Pool = pool;
        Gym = gym;
    }

    public String getAtrium() {
        return Atrium;
    }

    public void setAtrium(String atrium) {
        Atrium = atrium;
    }

    public String getLaundry() {
        return Laundry;
    }

    public void setLaundry(String laundry) {
        Laundry = laundry;
    }

    public int getElevatoramount() {
        return Elevatoramount;
    }

    public void setElevatoramount(int elevatoramount) {
        Elevatoramount = elevatoramount;
    }

    public String getRestorant() {
        return Restorant;
    }

    public void setRestorant(String restorant) {
        Restorant = restorant;
    }

    public String getPool() {
        return Pool;
    }

    public void setPool(String pool) {
        Pool = pool;
    }

    public String getGym() {
        return Gym;
    }

    public void setGym(String gym) {
        Gym = gym;
    }
}
