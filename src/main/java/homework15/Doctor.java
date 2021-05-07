package homework15;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
    private String name = new String();
    private String lastName = new String();
    private Position position;
    public void printDoctor(){
        System.out.println(name+" "+lastName+", "+position.name());
    }



    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
