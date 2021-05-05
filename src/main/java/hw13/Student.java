package hw13;

public class Student {
    private String name;
    private String lastName;
    private String major;

    public Student(String name, String lastName, String major) {
        this.name = name;
        this.lastName = lastName;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
