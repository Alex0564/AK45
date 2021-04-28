package HW8;

public class Work {
    public static void main(String[] args) {
        Player myFavPlayer = new Player();
        myFavPlayer.name = "Zidane";
        myFavPlayer.team= "Real Madrid";
        myFavPlayer.nationality="France";
        myFavPlayer.number = 5;
        System.out.println("Player Name= "+myFavPlayer.name+ "\nTeam= " +myFavPlayer.team+"\nNationality= "+myFavPlayer.nationality+"\nShirt #= "+myFavPlayer.number);

    }
}
