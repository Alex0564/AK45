package tickets;

public class App {
    public static void main(String[] args) {
        Tickets infant = new Tickets(1,1000);
        System.out.println(infant.getPrice());
        Tickets adult = new Tickets(36,1000);
        System.out.println(adult.getPrice());
        Tickets teen = new Tickets(12,1000);
        System.out.println(teen.getPrice());
        Tickets old = new Tickets(67,1000);
        System.out.println(old.getPrice());
    }
}
