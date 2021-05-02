import Lesson10a.Professor;
import Lesson10a.Sizes;
import Lesson10a.Student;
import Lesson10a.Worker;
import Lesson9a.Sneakers;

public class App10 {

    public static void main(String[] args) {

        Student mikhail = new Student("Mikhail","Jones",1990,"Math");
        System.out.println(mikhail.getMajor());

        Student viktor = new Student("Viktor","Polk",1989,"Biology");
        System.out.println(viktor.getLastName());


        Professor mrHill = new Professor("Bob","Hill",1979,"Economic");
        System.out.println(mrHill.getSubject());

        Professor msMay = new Professor("Helen","May",1980,"CS");
        System.out.println(msMay.getSubject());

        Worker mrHolmes = new Worker("Jone","Holmes",1968,"Gardener");
        System.out.println(mrHolmes.getOccupation());

        Worker msFolk = new Worker("Jill","Folk",1977,"Cook");
        System.out.println(msFolk.getOccupation());

        Sizes sneakers = Sizes.XXL;
        Sizes sneakers2 = Sizes.S;




    }

}
