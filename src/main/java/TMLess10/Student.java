package TMLess10;

public class Student extends Person{
    private Subjects major;
    private Subjects[] subjects;

    public Subjects[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    public Student(String name, String lastName, int year, Subjects major) {
        super(name, lastName, year);
        this.major = major;
    }

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }
}
