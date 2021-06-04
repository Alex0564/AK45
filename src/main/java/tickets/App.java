package tickets;

public class App {
    public static void main(String[] args) {
        Tickets passenger = new Tickets(3,2000);
        System.out.println(passenger.getPrice());
    }
}
