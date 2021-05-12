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

    }
}
