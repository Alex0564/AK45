package homework17;

public class App {
    public static void main(String[] args) {
        Lions lion = new Lions("Lions");
        System.out.println(lion);
        lion.canBreath();
        lion.canEat();
        lion.canReproduce();
        lion.feedMilk();
        lion.move();
        lion.spine();
        System.out.println("=============================");

        Whales whales = new BlueWhale("Blue whales");
        System.out.println(whales);
        whales.canBreath();
        whales.canEat();
        whales.canReproduce();
        whales.move();
        whales.spine();
        whales.feedMilk();
        System.out.println("=============================");

        Wolf wolf = new Wolf("Wolves");
        System.out.println(wolf);
        wolf.canBreath();
        wolf.canEat();
        wolf.canReproduce();
        wolf.move();
        wolf.spine();
        wolf.feedMilk();


    }
}
