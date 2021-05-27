package ao_tickets;

public class AO_App {
    public static void main(String[] args) {
        AO_Tickets passenger = new AO_Tickets(65, 1000);
        System.out.println(passenger.getPrice());
    }
}
