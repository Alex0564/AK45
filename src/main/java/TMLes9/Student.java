package TMLes9;

public class Student {
    private String name;
    private String lastname;
    private int year;
    private String major;

    public Student(String name, String lastname, int year, String major){
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.major = major;
    }
    public Student(String name, String lastname, int year){
        this.name = name;
        this.lastname = lastname;
        this.year = year;
    }
    public Student(){}

    public void setMajor(String major){
        this.major = major;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLastname(String lastName){
        this.lastname = lastName;
    }
    public void setYear(int year){
        this.year = year;
    }
}
