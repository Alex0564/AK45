package hw13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student("John", "Watson", "Science");
        Student s2 = new Student("Sarah", "Wilson", "Biology");
        Student s3 = new Student("Brad", "Thomson", "Psychology");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println();
        System.out.println(students.get(0).getName() + " " + students.get(0).getLastName() + " has a major: " +
                students.get(0).getMajor());

        System.out.println(students.get(1).getName() + " " + students.get(1).getLastName() + "'s major is " +
                students.get(1).getMajor());

        System.out.println(students.get(2).getName() + " " + students.get(2).getLastName() + " studies " + students.get(2).getMajor());
        s1.setLastName("Williams");

        System.out.println("Sarah Wilson after marriage has changed her Last name to " + s1.getLastName());

        students.add(0, new Student("Adam", "Miller", "Agriculture"));

        System.out.println("Now Last name of first student is: " + students.get(0).getLastName() + " instead of Watson");

        System.out.println("And his major is " + students.get(0).getMajor() + " instead of Science");

    }
}
