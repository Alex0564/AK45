package extraLesson;

public class Student extends Person{
    private final String major;
    public Student(String name, String lastName, int year, String major) {
        super(name, lastName, year);
        this.major=major;
    }
}
