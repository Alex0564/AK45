package lesson10;

public class App {
    public static void main(String[] args) {
//        Student xx = new Student();
////        xx.name = "David"; // Set
//        xx.setName("David");
//
////        String st = xx.name; // Get
//        String st = xx.getName();

//        System.out.println(st);
        int x = 5; // Set x
        int y = x; // Get x - Set y

        // ------------------------------------ Inheritance

        Student victor = new Student("Victor","Gonsalez",1999,Subjects.BIOLOGY);

        System.out.println(victor.getMajor());
        System.out.println(victor.getLastName());

        Person evan = new Person("Evan","McKenzy",1985);

        Teacher mrJones = new Teacher("Alex","Jones",1985,Subjects.ACCOUNTING);
        System.out.println(mrJones.getLastName());
        System.out.println(mrJones.getSubject());

        victor.setGender(Gender.MALE);
        mrJones.setGender(Gender.MALE);

        Subjects[]victorSubjects = {Subjects.CS,Subjects.MATH,Subjects.BIOLOGY};
        victor.setSubjects(victorSubjects);

    }
}
