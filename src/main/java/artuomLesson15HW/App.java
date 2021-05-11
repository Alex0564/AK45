package artuomLesson15HW;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer,Position>rooms=new HashMap<>();
        rooms.put(51,Position.IMMUNOLOGISTS);
        rooms.put(52,Position.ALLERGIST);
        rooms.put(53,Position.CARDIOLOGIST);
        rooms.put(54,Position.PHYSICIAN);
        rooms.put(55,Position.PULMONOLOGIST);
        rooms.put(56,Position.SURGEON);
    }
       Address hosp=new Address("3201 Kings Hwy","NYC","NY",11234);
      Hospital ms=new Hospital("Mount Sinai",hosp);

}
