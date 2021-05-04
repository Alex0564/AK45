package hw10;

public class App {
    public static void main(String[] args) {
        Son john = new Son("John", "Tompson", 1995, Subjects.FISHING);

        System.out.println(john.getName());
        System.out.println(john.getHobby());

        Mother Ann = new Mother("Ann", "Tompson", 1975);
        Grandson Eric = new Grandson("Eric", "Tompson", 2015, Subjects.SINGING);

        System.out.println(Eric.getHobby());

        Daughter Elena = new Daughter("Elena", "Tompson", 1994, Subjects.HUNTING);
        System.out.println(Elena.getLastname());





        }
    }
