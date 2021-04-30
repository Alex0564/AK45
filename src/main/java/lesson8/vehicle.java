package lesson8;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.SplittableRandom;

public class vehicle {
    public int year;
    public String make;
    public String model;
    public String color;

    public void start(){
        System.out.println( make +" "+ model + " " + "started enging" );
    }
    public void beep(){
        System.out.println(color+"car made beep");
    }

}
