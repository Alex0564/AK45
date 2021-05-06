package lesson10;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // -----------------------------Inheritance

        Student victor = new Student("Victor", "Gonsalez", 1999, Subjects.BIOLOGY);

        System.out.println(victor.getMajor());
        System.out.println(victor.getLastName());

        Person evan = new Person("Evan", "McKenzy", 1985);

        System.out.println(evan);

        Teacher mrJones = new Teacher("Alex", "Jones", 1985, Subjects.ACCOUNTING);
        System.out.println(mrJones.getLastName());
        System.out.println(mrJones.getSubject());

        victor.setGender(Gender.MALE);
        mrJones.setGender(Gender.MALE);

        Subjects[] victorSubjects = {Subjects.CS, Subjects.MATH, Subjects.BIOLOGY};

    }
}
