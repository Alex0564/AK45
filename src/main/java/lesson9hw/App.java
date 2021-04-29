package lesson9hw;

public class App {
    public static void main(String[] args) {
        Employee robert = new Employee("Robert","Duva","Bartender",5);
        Employee rafael = new Employee("Rafael","Cook",3);
        Employee julian = new Employee();
        julian.setName("Julian");
        julian.setLastName("Ross");
        julian.setPosition("Housekeeper");
        julian.setExperience(10);

        julian.printInfo();
        robert.printInfo();

        FlightTime myFlight = new FlightTime();
        myFlight.setDeparture("New York,NY - JFK");
        myFlight.setArrival("Key West,FL - EYW");
        myFlight.setFlightTime(3.05);

        myFlight.printInfo();

        Vegetable tomato = new Vegetable("Tomato");
        tomato.printInfo();

        Vegetable bellPepper = new Vegetable();
        bellPepper.setName("Bell Paper");
        bellPepper.color = VegetableColor.RED;
        bellPepper.printInfo();


    }
}
