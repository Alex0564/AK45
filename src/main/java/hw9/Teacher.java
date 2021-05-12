package hw9;

public class Teacher {
    private String name;
    private String lastName;
    private String subject;
    private int numberOfStudent;

    // Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNumbersOfStudents(int numberOfStudent) {
        if (numberOfStudent > 40 || numberOfStudent < 1) {
            throw new IllegalArgumentException("Wrong number");
        }
        this.numberOfStudent = numberOfStudent;
    }
    // Getters:

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    // printInfo method:

    public void printInfo() {
        System.out.println(
                "Our " + subject + " teacher " + name + " " +
                        lastName + " has " + numberOfStudent +
                        " students in a class");
    }

    // constructor:
    public Teacher(String name, String lastName, String subject, int numberOfStudent) {
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
        setNumbersOfStudents(numberOfStudent);

    }

    // default constructor:

    public Teacher() {
    }

    //toString constructor that allows to print out Class object:

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
