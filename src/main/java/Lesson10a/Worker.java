package Lesson10a;

public class Worker extends Person1{
    public String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Worker(String name, String lastName, int year, String occupation){
        super(name, lastName, year);
        this.occupation = occupation;
    }
}
