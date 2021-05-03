package lesson10ez;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        Student xx = new Student();
////        xx.name = "David";  //Set
//        xx.setName("David");
//
////        String st = xx.name; //Get
//        String st = xx.getName();
//        System.out.println(st);

//        int x = 5; // Set x
//        int y = x; //Get x - Set y

        // -------------Inheritance

        Student victor = new Student("Victor","Gonzalez",1999,Subjects.BIOLOGY);

        System.out.println(victor.getMajor());
        System.out.println(victor.getLastName());

        Person evan = new Person("Evan","McKenzye",1985);

        Teacher mrJones = new Teacher("Alex","Jones",1985,Subjects.ACCAUNTING);
        System.out.println(mrJones.getLastName());
        System.out.println(mrJones.getSubjects());

        victor.setGender(Gender.MALE);
        mrJones.setGender(Gender.MALE);
        System.out.println(victor.getGender());

        Subjects[] victorSubjects = {Subjects.CS,Subjects.BIOLOGY,Subjects.MATH};
        victor.setSubjects(victorSubjects);
//        for (Subjects s:VictorSubjects){
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(victorSubjects));
    }
}
