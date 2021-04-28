package hw8;

public class App {
    public static void main(String[] args) {

        Home friendshome = new Home();
        friendshome.location = "Florida";
        friendshome.style = "mediterranean";
        friendshome.buildYear = 1972;
        friendshome.story = 2;
        friendshome.bedroom = 5;
        friendshome.exteriorColor = "Yellow";
        friendshome.price = 420000;

        Home myHome = new Home();
        myHome.location = "Missouri";
        myHome.style = "ranch";
        myHome.buildYear = 2006;
        myHome.story = 1;
        myHome.bedroom = 4;
        myHome.exteriorColor = "Grey";
        myHome.price = 350000;

        myHome.homeCost();
        System.out.println("*************************************************++++++++****+**");
        friendshome.homeCost();
        System.out.println("*************************************************++++++++++**++++***+**");

        Teacher english = new Teacher();
        english.name = "Sara";
        english.lastName = "Thomson";
        english.subject = "English";
        english.numberOfStudents = 22;

        Teacher math = new Teacher();
        math.name = "Tom";
        math.lastName = "Ford";
        math.subject = "Mathematics";
        math.numberOfStudents = 16;

        english.work();
        System.out.println("*******************************************************");
        math.work();
        System.out.println("*******************************************************");

        Tour dream = new Tour();
        dream.destination = "Bahamas";
        dream.season = "Fall";
        dream.week = 3;
        dream.cost = 2500;

        Tour romance = new Tour();
        romance.destination = "Paris";
        romance.season = "Summer";
        romance.week = 2;
        romance.cost = 2000;

        dream.tourCost();
        System.out.println("*******************************************************");
        romance.tourCost();
        System.out.println("*************************");

        Vehicle myCar = new Vehicle();
        myCar.make = "Mazda";
        myCar.model = "CX-30";
        myCar.color = "Grey";
        myCar.year = 2020;
        myCar.cost = 26000;

        Vehicle friendsCar = new Vehicle();
        friendsCar.make = "Nissan";
        friendsCar.model = "Rogue";
        friendsCar.color = "Silver";
        friendsCar.year = 2018;
        friendsCar.cost = 18000;

        System.out.println("My car info is following:" + myCar.getInfo());
        System.out.println("*********************************");
        System.out.println("My friend's car info is following:" + friendsCar.getInfo());

    }
}
