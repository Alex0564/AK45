package hw8oa;

public class Bus {
    public int number;
    public String color;

    public void pass (){
        System.out.println("Bus number " + number + " just passed.");
    }
    public void stop () {
        System.out.println(color + " bus stopped on the corner.");
    }
}
