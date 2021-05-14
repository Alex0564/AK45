package ticketsA;

public class App {
    public static void main(String[] args) {
        Tickets infant = new Tickets(1, 1000);
        System.out.println(infant.getPrice());
        Tickets adult = new Tickets(25, 1000);
        System.out.println(adult.getPrice());
    }
}
