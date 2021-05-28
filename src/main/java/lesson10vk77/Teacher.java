package lesson10vk77;

public class Teacher extends Person{
    private Subjects subject;

    public Teacher(String name, String lastName, int year, Subjects subject) {
        super(name,lastName,year);
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
