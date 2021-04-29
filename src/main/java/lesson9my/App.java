package lesson9my;

public class App {
    public static void main(String[] args) {
//        Person david = new Person();
//        String ne = "Paul";
//        david.setName(ne);
//
//        String str = david.getName();
//        System.out.println(str);
//
//        david.setLastName("Cannon");
//        str = david.getLastName();
//        System.out.println(str);
//
//        david.setYear(2005); // на самом деле 1963 см. public void setYear
//        System.out.println(david.getYear()); // на самом деле 1900 см. Public int getYear
        Person ann = new Person("Anna","", 2004);
        Person alex = new Person("Alex", "Ling");
        alex.setYear(1963);
        ann.setYear(2000);
        Person Lenny = new Person("Lenny", "Park");

        System.out.println(ann.getYear());
        System.out.println(alex.getYear());


    }

}
