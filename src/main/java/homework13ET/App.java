package homework13ET;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList <String> beer = new ArrayList<>();
        beer.add("Trumer Pills");
        beer.add("XX");
        beer.add("Budwiser");
        beer.add("Corona");
        System.out.println(beer);

        beer.add(1,"Baltika");
        System.out.println(beer);

        beer.remove("Corona");
        beer.set(3,"Pilzner");
        System.out.println(beer);

                for(String beerAll: beer){
            System.out.println(beerAll);
        }



    }
}
