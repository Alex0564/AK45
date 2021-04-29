package lesson9hw;

public class FlightTime {
    private String departure;
    private String arrival;
    private double flightTime;

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }
    public void printInfo(){
        System.out.println("Departure airport = "+departure+"\nArrival airport = "+arrival+"\nFlight Time = "+flightTime);
    }
}
