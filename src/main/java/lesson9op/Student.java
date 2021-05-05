package lesson9op;

public class Student {
    private String name;
    private String lastname;
    private int year;
    private String major;

    public Student(String name, String lastname, int yaer, String major){
        this.name = name;
        this.lastname = lastname;
        this.year = yaer;
        this.major = major;
    }
    public Student(String name, String lastname, int yaer){
        this.name = name;
        this.lastname = lastname;
        this.year = yaer;
    }
    public Student(){}

    public void setMajor(String major){
        this.major = major;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setYear(int year){
        this.year = year;
    }
}