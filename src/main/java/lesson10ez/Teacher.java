package lesson10ez;

public class Teacher extends Person {
    private Subjects subjects;

    public Teacher(String name, String lastName, int year, Subjects subjects) {
        super(name,lastName,year);
        this.subjects = subjects;
    }


    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
}
