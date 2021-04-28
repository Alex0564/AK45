package lesson8hw;

public class App {
    public static void main(String[] args) {

        Apartment santaClara = new Apartment();
        santaClara.style = "Condo";
        santaClara.bedrooms = 2;
        santaClara.floor = 2;
        santaClara.yearBuilt = 2000;

        Apartment solana = new Apartment();
        solana.style = "TownHouse";
        solana.bedrooms = 3;
        solana.floor = 1;
        solana.yearBuilt = 2020;

        System.out.println(solana.style);

//        santaClara.printInfo();
        solana.printInfo();

        TShirt gucci = new TShirt();
        gucci.brand = "Gucci";
        gucci.style = "Long Sleeve";
        gucci.color = "Multi";
        gucci.size = "L";
        gucci.price = 849.99;

        TShirt zara = new TShirt();
        zara.brand = "Zara";
        zara.style = "Tank Top";
        zara.color = "Orange;";
        zara.size = "M";
        zara.price = 19.99;

        gucci.printTshirtInfo();
        System.out.println(zara.getInfo());

        HotelRoom motel = new HotelRoom();
        motel.name = "Standard";
        motel.view = "No view";
        motel.beds = 1;
        motel.bedSize = "Full";

        HotelRoom marriott = new HotelRoom();
        marriott.name = "Suite";
        marriott.view = "Ocean view";
        marriott.beds = 2;
        marriott.bedSize = "King";

        marriott.RoomInfo();
    }
}
