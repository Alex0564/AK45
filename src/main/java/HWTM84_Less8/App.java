package HWTM84;

public class App {
    public static void main(String[] args) {
//------------------------Drivers----------------------------
        Drivers Driver01 = new Drivers();
        Driver01.name = "Alex";
        Driver01.lastname = "Simon";
        Driver01.id = "T122-3456-32-23";

        Drivers Driver02 = new Drivers();
        Driver02.name = "Ivan";
        Driver02.lastname = "Bronze";
        Driver02.id = "T122-3452-02-17";
        Driver02.phone="772.582.1432";
//--------------------------Trucks---------------------------
        Trucks Truck01 = new Trucks();
        Truck01.make = "Ford";
        Truck01.model = "F350";
        Truck01.license = "BF10041";
        Truck01.year = 2019;
        Truck01.driver = Driver01.lastname;

        Trucks Truck02 = new Trucks();
        Truck02.make = "Dodge";
        Truck02.model = "3500";
        Truck02.license = "BU00713";
        Truck02.year = 2020;
        Truck02.driver = Driver02.lastname;
//------------------------Services---------------------------
        Service service01 = new Service();
        service01.date = "01/18/2020";
        service01.license = Truck01.license;

        Service service02 = new Service();
        service02.date = "04/21/2021";
        service02.license = Truck02.license;
//------------------------Print------------------------------
        service01.goService();
        System.out.println(Truck01.getInfo());
        System.out.println(Driver01.getInfo());
        System.out.println("--------------");
        System.out.println(Truck02.getInfo());
        System.out.println(Driver02.getInfo());
    }
}
