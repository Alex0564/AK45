package HW10;

public class App {
    public static void main(String[] args) {
        Coach Arteta=new Coach("M.Arteta", "Spain", Pos.MANAGER);
        System.out.println(Arteta.getCoachInfo());
        System.out.println("\n");

        Goalkeeper Leno=new Goalkeeper("B.Leno", "Germany", Pos.GK, 1);
        System.out.println(Leno.getKeeperInfo());
        System.out.println("\n");

        Defender Tierney=new Defender("K.Tierney", "Scotland", Pos.DEF, 3);
        System.out.println(Tierney.getDefInfo());
        System.out.println("\n");

        Midfielder Xhaka= new Midfielder("G.Xhaka", "Switzerland", Pos.MID, 34, "Injured" );
        System.out.println(Xhaka.getMidInfo());
        System.out.println("\n");

        Forward Aubameyang=new Forward("P.Aubameyang", "Gabon", Pos.FW, 14, "Captain");
        System.out.println(Aubameyang.getFwInfo());
        System.out.println("\n");

    }
}
