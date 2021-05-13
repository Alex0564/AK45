package life;

public class App {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Field", "Zebra");
        lion1.move();
        lion1.breathe();
        lion1.reproduce();
        lion1.die();
        lion1.mammals();
        lion1.vertebrates();
        lion1.printLion();

        Wolf wolf1 = new Wolf("Forest", "Red");
        wolf1.move();
        wolf1.breathe();
        wolf1.reproduce();
        wolf1.die();
        wolf1.mammals();
        wolf1.vertebrates();
        wolf1.printWolf();

        BlueWhale blueWhale = new BlueWhale(3, "Northern whale");
        blueWhale.move();
        blueWhale.eat();
        blueWhale.breathe();
        blueWhale.reproduce();
        blueWhale.die();
        blueWhale.mammals();
        blueWhale.vertebrates();
        blueWhale.printBlueWale();




    }
}
