package Lesson10a;

public class Professor extends Person1{
    public String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Professor(String name, String lastName, int year, String subject) {
        super(name, lastName, year);
        this.subject = subject;

    }
}
