package lesson10;

public class Teacher {
    private String name;
    private String  lastName;
    private int year;
    private String subject;

    public Teacher(String name, String lastName, int year, String subject) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.subject = subject;
    }

    public Teacher() {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
