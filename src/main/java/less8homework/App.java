package less8homework;

public class App {
    public static void main(String[] args){
        Aircrafts A350 = new Aircrafts();
        A350.aircompany = "Quatar airways";
        A350.name = "Airbus A350";
        A350.seats = 325;

        Aircrafts B737 = new Aircrafts();
        B737.aircompany = "Delta";
        B737.seats = 162;
        B737.name = "Boeing 737";

        System.out.println(A350.aircompany);
        A350.info();
        System.out.println(B737.aircompany);
        B737.info();

        Movies WarDogs = new Movies();
        WarDogs.name = "War dogs";
        WarDogs.sort = "Comedy";
        WarDogs.year = 2016;

        Movies Parker = new Movies();
        Parker.year = 2013;
        Parker.sort = "Action";
        Parker.name = "Parker";

        System.out.println("Movie " + WarDogs.name + " is " + WarDogs.sort);
        System.out.println("Movie " + Parker.name + " is " + Parker.sort);

        Songs Tattoo = new Songs();
        Tattoo.name = "Tatoo";
        Tattoo.album = "Heaven and Hell";
        Tattoo.artist = "Ava Max";
        Tattoo.rate = 5;

        Songs Alice = new Songs();
        Alice.artist = "Lady Gaga";
        Alice.rate = 4;
        Alice.name = "Alice";
        Alice.album = "Chromatica";

        System.out.println("\nSong " + Tattoo.name + " by " + Tattoo.artist + " has rate " + Tattoo.rate);
        System.out.println("Song " + Alice.name + " by " + Alice.artist + " has rate " + Alice.rate + "\n");

        Tools wrench = new Tools();
        wrench.electical = false;
        wrench.name = "Metric wrench";
        wrench.price = 52.78;
        wrench.sort = "Hand tool";

        Tools drill = new Tools();
        drill.sort = "Power tool";
        drill.name = "Hammer drill";
        drill.electical = true;
        drill.price = 129.99;

        int n = 14;
        Double price1 = wrench.cost(n);
        Double price2 = drill.cost(n);

        System.out.println(n + "pcs of " + wrench.name + " cost  $" + wrench.cost(n));
        System.out.println(n + "pcs of " + drill.name + " cost  $" + drill.cost(n));




    }

}
