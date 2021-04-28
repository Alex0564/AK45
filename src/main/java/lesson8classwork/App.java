package lesson8classwork;

public class App {
    public static void main(String[] args) {
        Person david = new Person();
        david.name = "Davi";
        david.lastName = "Wilson";
        david.year = 1998;

        Person Anna = new Person();
        Anna.name = "Ann";
        Anna.lastName = "Smith";
        Anna.year = 2005;


//        System.out.println(david.lastName);
        david.lastName = "Smith";
//        System.out.println(david.lastName);
//        david.start();
//        Anna.finish(2005);
       String a = Anna.info();
        System.out.println(a);
        System.out.println(david.info());


    }
}
