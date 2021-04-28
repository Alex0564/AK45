package hw8oa;

public class Student {
    public int id;
    public String name;
    public String lastName;

    public void complete () {
        System.out.println("Student "+ name + " " + lastName + " completed an assignment.");
    }
    public void assign () {
        System.out.println("Student " + name + " " + lastName + " has " + id + " ID number.");
    }

}
