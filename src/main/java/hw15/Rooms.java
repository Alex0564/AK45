package hw15;

import java.util.HashMap;
import java.util.Map;

public class Rooms {

    private Map<Integer,String> rooms = new HashMap<Integer,String>();

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public Rooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Room " +rooms ;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
     rooms.put(22,"Gastroenterology");
     rooms.put(32,"Physician");
     rooms.put(42,"Dentist");
     rooms.put(52,"Dermatologist");
     rooms.put(62,"Pediatric");
    }
}
