package lesson9hw;

public class FlightTime {
    private String departure;
    private String arrival;
    private double flightTime;

    public FlightTime(String departure, String arrival, double flightTime){
        this.departure = departure;
        this.arrival = arrival;
        this.flightTime = flightTime;
    }
    public FlightTime(){}

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }

    public void printInfo(){
        System.out.println("Departure airport = "+departure+"\nArrival airport = "+arrival+"\nFlight Time = "+flightTime);
    }

}
