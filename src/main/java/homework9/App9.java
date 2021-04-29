package homework9;

public class App9 {
    public static void main(String[] args) {
        Chocolate baker = new Chocolate();
        baker.setName("Baker");
        baker.setType("wite");

        System.out.println(baker.getType());
        System.out.println(baker.getName());

        Chocolate blackmagic = new Chocolate();
        blackmagic.setName("Black Magic");
        blackmagic.setType("black");

        System.out.println(blackmagic.getType());
        System.out.println(blackmagic.getName());

        baker.printInfo();
        blackmagic.printInfo();

        Beer stella = new Beer();
        stella.setPrice(4);
        System.out.println("Stella cost "+stella.getPrice()+"$");

        Beer guinness = new Beer();
        guinness.setPrice(7);
        System.out.println("Guinnes price is "+guinness.getPrice()+"$");

        Participants tom = new Participants("Tom", "director", 45);
        Participants anna = new Participants("Anna", "assistant");
        Participants olga = new Participants();
        olga.setName("Olga");

        tom.printInfo();
        anna.printInfo();
        olga.printInfo();

        SeatNumber olga1 = SeatNumber.SEVEN;

        Watch myWatch = new Watch();
        myWatch.setBrand("Rolex");
        myWatch.setModel("Submariner");
        myWatch.setPrice(35000);

        myWatch.printInfo();

        Watch yourWatch = new Watch();
        yourWatch.setBrand("Cartier");
        yourWatch.setModel("Tank");
        yourWatch.setPrice(15000);

        yourWatch.printInfo();

    }
}
