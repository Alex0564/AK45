package hw12;

public class Student implements IPerson{
    private String name;
    private int yearOfBirth;
   private int yearOfAdmission;
   private int date;   // date - present year

    public Student(String name, int yearOfBirth, int yearOfAdmission, int date) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.yearOfAdmission = yearOfAdmission;
        this.date = date;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return date - yearOfBirth;
    }



    @Override
    public int yearsInCollege() {
        return date - yearOfAdmission;
    }
}
