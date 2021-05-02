package ArtuomLesson9HW;

public class House {
    private int floor;
    private int apt;
    private String Streetname;
    private int house;

    public House(int floor, int apt, String streetname, int house) {
        this.floor = floor;
        this.apt = apt;
        Streetname = streetname;
        this.house = house;
    }


    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setApt(int apt) {
        this.apt = apt;


    }

    public int getApt() {
        return apt;
    }

    public void setStreetname(String streetname) {
        Streetname = streetname;
    }

    public String getStreetname() {
        return Streetname;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getHouse() {
        return house;

    }

    public House(int apt, String streetname, int house) {
        this.apt = apt;
        Streetname = streetname;
        this.house = house;
    }

    public House() {
    }

    public void printClassA97(){
        System.out.println("Houses=" +this.house+ " on the "+this.Streetname+" has parametrs: "+  "Appartment="+this.apt+ " "+ "Floor= "+this.floor);
        System.out.println("And");

        printClassA98();

        printClassA99();

    }
    public void printClassA98() {
        System.out.println("Houses=98   "  + this.Streetname + " has parametrs: " + this.apt);
    }
    public void printClassA99() {
        System.out.println("Houses=99 has not built yet");
    }


}
