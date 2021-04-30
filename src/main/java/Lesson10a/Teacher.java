package Lesson10a;

public class Teacher {
    private String name;
    private String LastName;
    private int year;
    private Subjects subject;

    public Teacher(String name, String lastName, int year, Subjects subject) {
        this.name = name;
        LastName = lastName;
        this.year = year;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
