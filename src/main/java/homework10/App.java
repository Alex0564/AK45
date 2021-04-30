package homework10;

public class App {
    public static void main(String[] args) {
        Peony peony  = new Peony ("Peony", "pink", 15, AmountAvailableForSale.FIVE);
        System.out.println(peony.getInfo());
        System.out.println(peony.printInfo());

        Peony bigpeony = new Peony("Big Peony", "white", 21, AmountAvailableForSale.NINE);
        System.out.println(bigpeony.getInfo());
        System.out.println(bigpeony.printInfo());

        Flower lily = new Flower("Lily", "white", 13);
        System.out.println(lily.getInfo());
        Flower Hibiscus = new Flower("Hibiscus", "red", 7);
        System.out.println(Hibiscus.getInfo());

        Rose rose = new Rose("Rose", "purpur", 14);
        System.out.println(rose.getInfo());
        Rose darckrose = new Rose("Darck Rose", "black", 25);
        System.out.println(darckrose.getInfo());

        Sunflower wildsunflower = new Sunflower("Wild Sunflower", "yellow", 11, DeliverTo.CHICAGO);
        System.out.println(wildsunflower.getInfo());
        System.out.println(wildsunflower.prinCity());
        Sunflower bluesunflower = new Sunflower("Blue Sunflower", "blue", 17,DeliverTo.BOSTON);
        System.out.println(bluesunflower.getInfo());


        DeliverTo[]bluesunflowerCities = {DeliverTo.LA,DeliverTo.CHICAGO,DeliverTo.SF};
        bluesunflower.setDeliverTos(bluesunflowerCities);
        // не понимаю как этот массив распечатать со всем остальным




    }

}
