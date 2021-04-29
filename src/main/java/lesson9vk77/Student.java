package lesson9vk77;

public class Student {

    private String name;
    private String lastname;
    private int year;
    private String major;

    //constructor full
    public Student(String name, String lastname, int year, String major){
        this.name =name;
        this.lastname=lastname;
        this.year=year;
        this.major=major;
    }
    public Student(String name, String lastname, int year){
        this.name =name;
        this.lastname=lastname;
        this.year=year;

    }
    public void setMajor(String major){
        this.major=major;
    }

    public Student(){}
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }

}
