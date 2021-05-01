package HW10;

public class App {
    public static void main(String[] args) {
        Child nikita = new Child();
        nikita.name = "Nikita";
        nikita.year = "2010";
        nikita.major = "Major";
        nikita.lastName = "Wilson";

        System.out.println(nikita.lastName);
        System.out.println(nikita.name);
        System.out.println(nikita.year);
        System.out.println(nikita.major);

        Subjects football = new Subjects();
        football.name = "Football";
        football.subjects = "Ball";
        football.year = "year";
        System.out.println(football.subjects);
        System.out.println(football.year);

        Teacher mrsCapic = new Teacher();
        mrsCapic.name = "mrsCapic";
        mrsCapic.lastName = "Thomas";
        mrsCapic.year = "1959";
        mrsCapic.subject = "Math";

        System.out.println(mrsCapic.name);
        System.out.println(mrsCapic.lastName);
        System.out.println(mrsCapic.subject);

    }
}