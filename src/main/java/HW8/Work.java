package HW8;

public class Work {
    public static void main(String[] args) {
        Player myFavPlayer = new Player();
        myFavPlayer.name = "Zidane";
        myFavPlayer.team= "Real Madrid";
        myFavPlayer.nationality="France";
        myFavPlayer.number = 5;

        System.out.println("Player Name: "+myFavPlayer.name+ "\nTeam: " +myFavPlayer.team+"\nNationality: "+myFavPlayer.nationality+"\nShirt #: "+myFavPlayer.number);
        System.out.println("\n");





        Team myTeam = new Team();
        myTeam.name = "Arsenal";
        myTeam.Country = "England";
        myTeam.City = "London";
        myTeam.Founded = 1886;

        System.out.println("Team name: "+myTeam.name+"\nTeam Country: "+myTeam.Country+"\nTeam City: "+myTeam.City+"\nTeam Founded: "+myTeam.Founded);
    }
}
