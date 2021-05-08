package hosp2;

public class Rooms1 {
    private String nameRooms1;

    public Rooms1(String nameRooms1) {
        this.nameRooms1 = nameRooms1;
    }

    public String getNameRooms1() {
        return nameRooms1;
    }

    public void setNameRooms1(String nameRooms1) {
        this.nameRooms1 = nameRooms1;
    }
    public void printRooms1(){
        System.out.println(nameRooms1);
    }

    @Override
    public String toString() {
        return nameRooms1;
    }

}
