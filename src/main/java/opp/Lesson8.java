package opp;

public class Lesson8 {
    public static void main(String[] args) {
        Person iuliia = new Person();
        iuliia.name = "Iuliia";
        iuliia.lastname = "Khlopina";
        iuliia.age = 33;
        System.out.println(iuliia.name);

        iuliia.printPerson();

        Home myHome = new Home();
        myHome.type = "Apartment";
        myHome.district = "Garland";
        myHome.term = 1;
        System.out.println(myHome.type);

        myHome.printHome();

        Car c = new Car();
        c.mark = "Mazda";
        c.model = "CX5";
        c.year = 2015;
        System.out.println(c.mark);

        c.myCar();

        Animal cat = new Animal();
        cat.kind = "Cat";
        cat.species = "Scottish fold";
        cat.gender = "Hi";
        cat.color = "Chocolate";
        cat.nameAnimal = "Mars";
        System.out.println(cat.species);

        cat.myAnimal();

    }
}
