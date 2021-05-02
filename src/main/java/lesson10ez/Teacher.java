package lesson10ez;

public class Teacher extends Person{
//    super(name,lastName,year);
    private Subjects major;

    public Teacher(String name, String lastName, int year, Subjects major) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.major = major;
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

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }
}
