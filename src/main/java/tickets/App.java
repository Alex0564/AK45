package tickets;

public class App {
    public static void main(String[] args) {
        Tickets passenger = new Tickets(2,1000);
        System.out.println(passenger.getPrice());
    }
}
