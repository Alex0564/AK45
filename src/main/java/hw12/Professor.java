package hw12;

public class Professor implements IPerson{
    private String name;
    private int yearOfBirth;
    private int start;  // year when a professor has started working in college
    private int date;   // present year

    public Professor(String name, int yearOfBirth, int start, int date) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.start = start;
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
        return date - start;
    }
}
