package less12homework;

public class App {
    public static void main(String[] args) {
        USA NewYorkWashington = new USA(360, 65.0);
        USA ChicagoNewYork = new USA(1260, 100.0);
        Distance TampaMiami = new USA(450, 120.0);
        System.out.println("Information about trip Chicago - NewYork:");
        ChicagoNewYork.infAboutDistance();
        System.out.println("Time= "+ChicagoNewYork.getTime()+
                " hrs witn speed="+ChicagoNewYork.speed+
                " km per hr");

        Poland KrakowLublin = new Poland(255, 80.0);
        KrakowLublin.distanceInKm = 260;
        KrakowLublin.speed = 88.0;
        Poland WroclawLodz = new Poland(217, 100.0);
        Distance LublinKatowice = new Poland(305, 70.0);
        System.out.println("Information about trip Wroclaw - Lodz:");
        WroclawLodz.infAboutDistance();
        System.out.println("Time= "+WroclawLodz.getTime()+
                " hrs witn speed="+WroclawLodz.speed+
                " km per hr");



    }
}
