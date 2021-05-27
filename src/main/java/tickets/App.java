package tickets;

public class App {
    public static void main(String[] args) {
        Tickets infant = new Tickets(1,1000);
        System.out.println(infant.getPrice());

        Tickets child = new Tickets(12,1000);
        System.out.println(child.getPrice());

        Tickets adult = new Tickets(24,1000);
        System.out.println(adult.getPrice());

        Tickets senior = new Tickets(74,1000);
        System.out.println(senior.getPrice());



    }
}
