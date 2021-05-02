package Lesson9Encapsolytion;

public class Student {
    private String name;
    private String lastname;
    private  int year;
    private String major;

    public Student(String name, String lastName, int year, String major){
        this.name=name;
        this.lastname=lastName;
        this.year=year;
        this.major=major;

    }
    public Student(String name, String lastName, int year){
        this.name=name;
        this.lastname=lastName;
        this.year=year;

    }
    public Student(){}

    public void setMajor(String major){
        this.major=major;

    }
    public void setName(String name){
        this.name=name;

    }
    public void setLastname(String LastName){
        this.lastname=LastName;

    }
    public void setYear(int year){
        this.year=year;
    }

    public void printInfo() {
        System.out.println("Student{" +
                "name='" + name+ '\'' +
                ", Lastname='" + lastname + '\'' +
                ", year=" + year +
                '}');
    }



}
