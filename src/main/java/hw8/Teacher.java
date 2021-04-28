package hw8;

public class Teacher {

    public String name;
    public String lastName;
    public String subject;
    public int numberOfStudents;

    public void work() {
        System.out.println(subject + " teacher " + name + " " + lastName + " has " + numberOfStudents + " students in a class");
    }
}
