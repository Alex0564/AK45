package hw12;

public class App {
    public static void main(String[] args) {

        Student bobHall = new Student("Bob Hill",2001,2020,2021);
        System.out.println(bobHall.name());
        System.out.println("age "+bobHall.age());
        System.out.println("college course: "+bobHall.yearsInCollege());
        System.out.println("   ");

        //////////////////////////////////////////////////////////////////////

        Student mikeJill = new Student("Mike Jill",2000,2019,2021);
        System.out.println(mikeJill.name());
        System.out.println("age "+mikeJill.age());
        System.out.println("college course: "+mikeJill.yearsInCollege());
        System.out.println("   ");

        //////////////////////////////////////////////////////////////////////

        Professor mrNeal = new Professor("Mr. Neal",1978,2002,2021);
        System.out.println(mrNeal.name());
        System.out.println("age "+mrNeal.age());
        System.out.println(mrNeal.yearsInCollege()+" years works in the college.");
        System.out.println("   ");

        //////////////////////////////////////////////////////////////////////

        Professor msHolmes = new Professor("Ms. Holmes",1984,2010,2021);
        System.out.println(msHolmes.name());
        System.out.println("age "+msHolmes.age());
        System.out.println(msHolmes.yearsInCollege()+" years works in the college.");
        System.out.println("   ");

    }
}
