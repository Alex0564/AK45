package hw15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Address address1 = new Address("2601 Ocean Pkw,","Brooklyn","NY",11235);
        Hospital hospital1 = new Hospital("Coney Island",address1);
        Doctor drHolmes = new Doctor("Helen","Holmes",Position.PHYSICIAN);


        System.out.println(drHolmes);
        System.out.println(hospital1);

    }

}
