package homework9x;

public class Hw9 {
    public static void main(String[] args) {
        //1//1st-2nd Objects(vasya and alena) of Person class
        Person vasya = new Person("Vasya", "Kuznecov", 6.2, 1987);

        Person alena = new Person();
        alena.setName("Alena");
        alena.setLastName("Kuznecova");
        alena.setYear(1990);
        alena.setHeight(5.7);

        vasya.printInfo();
        alena.printInfo();


        //2//1st-2nd Objects(phillip and anna) of Student class
        Student phillip = new Student("Phillip", "Anderson", "12 New Dorp Lane, State Island, New York");

        Student anna = new Student();
        anna.setName("Anna");
        anna.setLastName("Watson");
        anna.setAddressOfschool("Stuart High School");

        phillip.printInfo();
        anna.printInfo();


        //3//1st-2nd Objects(country1 and country2) of CountryInfo
        CountryInfo country1 = new CountryInfo("China", "Beijing", 1400000000);

        CountryInfo country2 = new CountryInfo();
        country2.setCountryName("Russia");
        country2.setCapitalName("Moscow");
        country2.setPopulation(144000000);

        country1.printInfo();
        country2.printInfo();


        //4//1st-2nd Objects(myCar and newCar) of Vehicle
        Vehicle myCar = new Vehicle("Honda", "Accord", "Black", 2019);
        Vehicle newCar = new Vehicle();
        newCar.setMake("Nissan");
        newCar.setModel("GTR");
        newCar.setColor("Silver");
        newCar.setYear(2009);

        myCar.printInfo();
        newCar.printInfo();

        //5//Enum
        VehicleE NewCar = new VehicleE();
        NewCar.make = "Ford";
        NewCar.model = "GT";
        NewCar.type = CarPackageType.SPORT;
        System.out.println(NewCar.type);
    }

}
