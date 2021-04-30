package hw10vk77;

public class App {
    public static void main(String[] args) {

        ///Class HOUSE -super
        System.out.println("Class HOUSE -super class");
        System.out.println("=======================");
        House myhouse = new House(3,2,"street door","ceramic roof");
        House neighborhouse = new House(5,3,"street & backyard door","flat roof");
        System.out.println("In my house "+myhouse.getRooms()+" rooms & "+ myhouse.getBathroom()+" Bathrooms. ");
        System.out.println("In next house "+neighborhouse.getRooms()+" rooms & "+ neighborhouse.getBathroom()+" Bathrooms. ");

        // Mobilehouse - extends House
        System.out.println("2nd class Mobilehouse - extends House");
        System.out.println("=======================");
        Mobilehouse moby = new Mobilehouse(2,1,"Street door", "metal","6","2.6 liter");
        Mobilehouse mobilehouse = new Mobilehouse(3,1,"Street door & Side door", "Flat","0","2.6 liter");
        System.out.println("We bought Mobile house for travel. There is " + moby.getRooms() +" rooms " +moby.getBathroom() +" bathrroms inside , "+moby.getEngine() + " engine and "+moby.getTires()+ " tires on it." );
        System.out.println("By the way in regular we live in mobile house as well. There is "+mobilehouse.getRooms() +" rooms inside "+mobilehouse.getEntrance()+" entrances"+mobilehouse.getBathroom() +" bathrooms "+mobilehouse.getRoof()+" roof type");


        // Aptbuilding - extends House
        System.out.println("3rd class  Aptbuilding - extends House");
        System.out.println("=======================");
        Aptbuilding AptblngB = new Aptbuilding(5,60, false );
        Aptbuilding AptblngQ = new Aptbuilding(120,120,"back yard and main door entrances","flat",6,60, true );

        System.out.println("Company bought appartments-building. There is "+AptblngB.getFloors()+" floors, "+AptblngB.getAptamount()+" apartments"+ (AptblngB.isElevator()?"elevator inside. ":" NO ELEVATOR inside"));
        System.out.println("Company bought second appartments-building also. There is "+AptblngQ.getFloors()+" floors, "+AptblngQ.getEntrance() +"  and"+ (AptblngQ.isElevator()?"elevator inside. ":" NO ELEVATOR inside"));


        //Hotel - extends Aptbuilding
        System.out.println("4th class Hotel - extends Aptbuilding");
        System.out.println("=======================");
        Hotel Hollydays = new Hotel("MediaHall Atruim","2 laundry rooms ",4,"Italian ","compact pool","modern GYM");
        Hotel Springs = new Hotel("Little Atruim","2 laundry rooms ",4,"Pizza and Pasta ","compact pool","old style GYM");
        System.out.println("When we visited New York city in 2019 - we chose the hotel with  "+ Hollydays.getPool() +" and "+Hollydays.getGym() +" and super restorant "+Hollydays.getRestorant());
        System.out.println("This year we are going to select  hotel with  "+ Springs.getPool() +" and "+Springs.getGym()+" and wonderful restorant "+ Springs.getRestorant());














    }
}
