package less9homework;

public class App {
    public static void main(String[] args){
    Student alex = new Student("Alex", "Ling", "New York");
    Student bob = new Student();
    bob.setCity("Chicago");
    bob.setFiresName("Bob");
    bob.setLastName("Cannon");
    System.out.println("Student " + bob.getFiresName() + " " + bob.getLastName() + " is from " + bob.getCity());
    System.out.println("Student " + alex.getFiresName() + " " + alex.getLastName() + "  is from " + alex.getCity());

    apartment first = new apartment();
        first.setApt(15);
        first.setHouse(2033);
        first.setStreet("West 12th");
    apartment second = new apartment(354, 54, "East 35th");
    System.out.println("\nFirst  apartment: " + first.getApt()+ " " + first.getStreet() + " Str Apt# " + first.getApt());
    System.out.println("Second apartment: " + second.getApt()+ " " + second.getStreet() + " Str Apt# " + second.getApt());

    beverage beer = new beverage();
        beer.setName("Corona");
        beer.setBottle("glass bottle");
        beer.setVolume(12.0);

        beverage cider = new beverage("Woodchuck", 16.0, "metal can");
        System.out.println("\n"+beer.getName()+  "    in "+ beer.getBottle() + " "+ beer.getVolume() + " oz" );
        System.out.println(cider.getName()+  " in "+ cider.getBottle() + "    "+ cider.getVolume() + " oz" );

        city chicago = new city("Chicago", 1.7,"The USA");
        city toronto = new city("Toronto", 2.93,"Canada");
        System.out.println("\n"+chicago.getPopulation()+" million people live in the city of "+chicago.getName()+" , "+chicago.getCountry());
        System.out.println(toronto.getPopulation()+" million people live in the city of "+toronto.getName()+" , "+toronto.getCountry());
    }


}
