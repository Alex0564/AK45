package dianalesson10;

public class App {
    public static void main(String[] args){
        //Student xx = new Student();
        //xx.setName("David");
       // xx.name = "David"; //Set

        //String st = xx.name; // Get
       // String st = xx.getName();

      //  System.out.println(st);

        // int x = 5;  //Set x
        // int y = x; //Get x - or Set y

        //--------------------------------------------Inheritance

        Student victor = new  Student("Victor", "Gonsalez", 1999, Subjects.BIOLOGY);

        System.out.println(victor.getMajor());
        System.out.println(victor.getLastName());

        Person evan = new Person("Evan", "Kenzy", 1985);

        Teacher mrJohnes = new Teacher("Alex", "Johnes", 1988, Subjects.CHEMISTRY);
        System.out.println(mrJohnes.getLastName());
        System.out.println(mrJohnes.getSubject());

        victor.setGender(Gender.MALE);
        mrJohnes.setGender(Gender.MALE);
    }

    }

