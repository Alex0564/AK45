package homework13op;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Movies> film = new ArrayList<>();
        Movies homeAlong = new Movies("Home Along");
        Movies queensGambit = new Movies("Queen's Gambit");
        Movies dieHard = new Movies("Die Hard");
        Movies goneWithTheWind = new Movies("Gone with the wind");
        film.add(homeAlong);
        film.add(dieHard);
        film.add(dieHard);
        film.add(goneWithTheWind);

        System.out.println(film.get(0).getName());

        System.out.println(film.get(1).getName() );

        System.out.println(film.get(3).getName() );


    }
}
