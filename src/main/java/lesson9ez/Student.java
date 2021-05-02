package lesson9ez;

public class Student {
    private String name;
    private String lastName;
    private int year;
    private String major;

    public Student(String name, String lastName, int year,String major){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.major = major;
    }

    public Student(String name,String lastName,int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }
    public Student(){

    }
    public void setMajor (String major){
        this.major = major;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setYear(int year){
        if(year>2011 || year<1970){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
    }
}
