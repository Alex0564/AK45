package TMLess10;

public class App {
    public static void main(String[] args) {
//        Student xx = new Student();
//        xx.name = "David";
//        xx.setName("David");
////        -----------------------
//        String st = xx.Name();
//        String st = xx.getName();
        Student victor = new Student("Victor", "Gonsalez", 1999, Subjects.BIOLOGY);
//        System.out.println(victor.getMajor());
//        System.out.println(victor.getLastName());

        Person evan = new Person("Evan", "McKenzy", 1985);

        teacher mrJones = new teacher("Alex", "Jones", 1985, Subjects.ACCOUNTING);

//        System.out.println(mrJones.getLastName());
//        System.out.println(mrJones.getSubject());
//
//        victor.setGender(Gender.MALE);
//        mrJones.setGender(Gender.MALE);

        Subjects[]victorsSubjects = {Subjects.CS, Subjects.MATH, Subjects.BIOLOGY};
        victor.setSubjects(victorsSubjects);

//        int i = 0;
//        while (i<=2) {
//            System.out.println(victorsSubjects[i]);
//            i++;
//        }
    }
}
