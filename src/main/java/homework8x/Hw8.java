package homework8x;

public class Hw8 {
    public static void main(String[] args) {

        //1//1st-2nd Objects of the Class: Smartphone
        Smartphone NewPhone = new Smartphone();
        NewPhone.make = "Apple";
        NewPhone.model = "Iphone 7 Plus";
        NewPhone.color = "Red";

        Smartphone OldPhone = new Smartphone();
        OldPhone.make = "Samsung";
        OldPhone.model = "Galaxy S5";
        OldPhone.color = "Black";

        NewPhone.TurnOff();
        OldPhone.TurnOff();

        //2//1st-2nd Objects of the Class: Fruit
        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";
        apple.cultivar = "Red Delicious";
        apple.season = "Autumn";

        Fruit apricot = new Fruit();
        apricot.name = "Apricot";
        apricot.color ="Yellow";
        apricot.cultivar = "Aprium";
        apricot.season = "Summer";

        apple.ripen();
        apricot.ripen();

        //3//1st-2nd Objects of the Class: Vehicle
        Vehicle SportVehicle = new Vehicle();
        SportVehicle.make = "Ford";
        SportVehicle.model = "GT";
        SportVehicle.color = "Silver";
        SportVehicle.year = 2015;

        Vehicle SportVehicle2 = new Vehicle();
        SportVehicle2.make = "Nissan";
        SportVehicle2.model = "GTR";
        SportVehicle2.color = "Red";
        SportVehicle2.year = 2015;

        SportVehicle.GetInfo();
        SportVehicle2.GetInfo();

        //4//1st-2nd Objects of the Class: Person
        Person jason = new Person();
        jason.name = "Jason";
        jason.lastname = "Abrams";
        jason.year = 1987;
        jason.height = 5.11;

        Person jack = new Person();
        jack.name = "Jack";
        jack.lastname = "Abrams";
        jack.year = 1995;
        jack.height = 6.2;

        jack.GetInfo();
        jason.GetInfo();
    }

}
