package TMLes8;

public class App8 {
    public static void main(String[] args) {
        Person David = new Person();
        David.name = "David";
        David.lastname = "Wilson";
        David.year = 1998;

        Person Anna = new Person();
        Anna.name = "Anna";
        Anna.lastname = "Wilson";
        Anna.year = 1999;

        System.out.println(David.name + " " + David.lastname);

        Vehicle mycar = new Vehicle();
        mycar.color = "Blue";
        mycar.make = "Nissan";
        mycar.model = "Rogue";
        mycar.year = 2014;

        Vehicle wifecar = new Vehicle();
        wifecar.model = "Lancer";
        wifecar.make = "Mitsubishi";
        wifecar.color = "Blue";
        wifecar.year = 2014;

        System.out.println(wifecar.make);
        System.out.println(wifecar.year);

    }
}
