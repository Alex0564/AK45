package TMLess10;

public class teacher extends Person{
    private Subjects subject;

    public teacher(String name, String lastName, int year, Subjects subject) {
        super(name, lastName, year);
        this.subject = subject;
    }

        public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

}
