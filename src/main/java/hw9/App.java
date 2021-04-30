package hw9;

public class App {
    public static void main(String[] args) {

        /* Homework for Lesson 9 Encapsulation, getters/setters, constructors

       1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
       each class has at least 2 constructors (default and full)
       create printClass()/ printInfo() method to print out all fields
       fields are private each field has getter and setter
       2. In the App class create main() and create 2 instances of each class;
       one instance created used default constructor - fill up fields using setter
       second object created using full constructor print object info using print-out method
         */

        // Class Home

        Home friendshome = new Home("Florida", "Colonial", 1972, 5);
        System.out.println();
        System.out.println("Info related to friend's house: ");
        System.out.println("Location: " + friendshome.getLocation());
        System.out.println("Style: " + friendshome.getStyle());
        System.out.println("Build year: " + friendshome.getBuildYear());
        System.out.println("Number of bedrooms: " + friendshome.getBedroom() + " bedrooms");
        System.out.println("**************************************************");

        Home antshome = new Home();
        antshome.setLocation("Missouri");
        antshome.setStyle("Ranch");
        antshome.setBuildYear(2005);
        antshome.setBedroom(4);
        System.out.println("My ant's home has " + antshome.getBedroom() + " bedrooms and was build in "
                + antshome.getBuildYear());
        System.out.println("*********************************************************************************");

        System.out.println("Full info related to ant's house: ");
        antshome.printInfo();
        System.out.println();
        System.out.println("Full info related to friend's house: ");
        friendshome.printInfo();
        System.out.println("***********************************************************************************");

        // Class Teacher

        Teacher english = new Teacher("Sara", "Thomson", "English", 22);
        System.out.println(english.getName());
        System.out.println(english.getLastName());
        System.out.println(english.getSubject());
        System.out.println("**********************************");

        Teacher math = new Teacher();
        math.setName("Tom");
        math.setLastName("Ford");
        math.setSubject("Math");
        math.setNumbersOfStudents(16);
        System.out.println("My " + math.getSubject() + " teacher's name is " + math.getName()
                + " " + math.getLastName());
        System.out.println("*********************************************************************************");

        System.out.println("Full info related to ant's house: ");
        antshome.printInfo();
        System.out.println();
        System.out.println("Full info related to friend's house: ");
        friendshome.printInfo();
        System.out.println("***********************************************************************************");

        // Class Tour

        Tour dream = new Tour("Bahamas", "Fall", 3, 2500);
        System.out.println("Tour information: ");
        System.out.println("Destination: " + dream.getDestination());
        System.out.println("Season: " + dream.getSeason());
        System.out.println("Weeks: " + dream.getWeek());
        System.out.println("Cost: $" + dream.getCost());
        System.out.println("**************************************");

        Tour romance = new Tour();
        romance.setDestination("Paris");
        romance.setSeason("Summer");
        romance.setWeek(2);
        romance.setCost(2000);
        System.out.println("I would love to go to " + romance.getDestination() + " in "
                + romance.getSeason() + "!");
        System.out.println("******************************************************************************************");

        System.out.println("Attention, Attention, Attention: ");
        dream.printInfo();
        System.out.println("******************************************************************************************");
        System.out.println("Why are you still waiting?!");
        romance.printInfo();
        System.out.println("******************************************************************************************");

        // Class Vehicle

        // enum
        VehicleColor c = VehicleColor.WHITE;
        System.out.println("Using enum: " + c);

        Vehicle myCar = new Vehicle("Mazda", "CX-30", 2020, VehicleColor.GREY);
        System.out.println("Info regarding my car: ");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("****************************************");

        Vehicle friendscar = new Vehicle();
        friendscar.setMake("Nissan");
        friendscar.setModel("Rogue");
        friendscar.setYear(2018);
        friendscar.setColor(VehicleColor.SILVER);

        System.out.println("My friend's car is a " + friendscar.getColor() + " " + friendscar.getMake() + " "
                + friendscar.getModel());
        System.out.println("****************************************");

        System.out.println("Full info regarding my car: ");
        myCar.printInfo();
        System.out.println();
        System.out.println("Full info regarding my friend's car: ");
        friendscar.printInfo();

    }
}
