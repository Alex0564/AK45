package Lesson10a;

public class Student extends Person1{
    private String major;


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String lastName, int year, String major) {
        super(name, lastName, year);
        this.major = major;




    }

}
