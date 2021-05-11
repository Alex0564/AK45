package ArtuomLesson13HW;



import java.util.ArrayList;
import java.util.List;

public class App3 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person Oleg = new Person("Oleg");
        people.add(Oleg);
        people.add(new Person("Dima "));
        people.add(new Person("Roma"));
        people.add(new Person("Denis"));
        System.out.println(people.get(0).getName());


        System.out.println("==============Add new Person===========");
        Person Victor = new Person("Victor");
        people.add(Victor);
        System.out.println(people.get(0).getName() + " " + people.get(1).getName() + people.get(2).getName() +
                " " + people.get(3).getName() + " " + people.get(4).getName());
        System.out.println();
        System.out.println();


                System.out.println("============================Add Person=================================");

        people.add(1, new Person("Veronika"));

        System.out.println(people.get(0).getName() + " " + people.get(1).getName() + " " + people.get(2).getName() +
                " " + people.get(3).getName() + "  " + people.get(4).getName() + " " + people.get(5).getName());

        System.out.println();
        System.out.println();

        System.out.println("====================Replace=====================");

        people.set(0, new Person("Artuom"));


        System.out.println(people.get(0).getName() + " " + people.get(1).getName() + " " + people.get(2).getName() +
                " " + people.get(3).getName() + " " + people.get(4).getName() + " " + people.get(5).getName());
        System.out.println();
        System.out.println();




        System.out.println("=======================Remove===========================");

        people.remove(2);
        people.remove(2);
        people.remove(2);
        people.remove(2);

        System.out.println(people.get(0).getName() + " " + people.get(1).getName()
        );
        System.out.println();
        System.out.println();

        System.out.println("================1th type Iteration=================");

        for (Person v : people) { //v.getName();}
            System.out.println(v.getName());
        }
        System.out.println();
        System.out.println();


        System.out.println("================2th type Iteration=================");

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());


        }


    }


}
