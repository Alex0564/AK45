package hw8oa;

public class Appliance {
    public String type;
    public String make;

    public void turnOn () {
        System.out.println(type + " " + make + " is turned on.");
    }
    public void brake (){
        System.out.println("Our " + type + " got broken." );
    }

}
