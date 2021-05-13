package hw10;

public class App {
    public static void main(String[] args) {

        // Homework for Lesson 10 Inheritance

        // super class Checking account

        CheckingAccount johnson = new CheckingAccount("Sarah", "Johnson", 1987,
                "123 Main Street, New York, 234087", Gender.FEMALE, LawfulStatus.US_CITIZEN);
        System.out.println();
        System.out.println("Lawful status: " + johnson.getStatus());
        System.out.println("Gender: " + johnson.getGender());
        System.out.println("Last name: " + johnson.lastName);
        System.out.println("*************************************");

        CheckingAccount mueller = new CheckingAccount("Tom", "Locaster", 1985, "12 Oak Dr, Manchester, 34508",
                Gender.MALE, LawfulStatus.CONDITIONAL_RESIDENT);

        System.out.println("Last name: " + mueller.lastName);
        System.out.println("Address: " + mueller.address);
        System.out.println("*************************************");

        // subclass Student account

        StudentAccount bauer = new StudentAccount("John", "Bauer", 2002,
                "456 Goldwin Street, Washington DC, 354667", Gender.MALE, LawfulStatus.PERMANENT_RESIDENT,
                Major.BUSINESS_ADMINISTRATION, 12, CheckOption.NOT_DECIDED, 25);
        System.out.println("Information about client:");
        bauer.printInfo();
        System.out.println("***************************************");

        // subclass Business account

        BusinessAccount logistic = new BusinessAccount("Fortune Logistics LLC", "Albert Schmidt", 2006,
                "12 Business Avenue, Dallas, Texas 20345", Gender.MALE, LawfulStatus.NON_IMMIGRANT,
                "Transportation and Logistics");

        logistic.printInfo();
        System.out.println("*******************************************");

        // subclass Senior account

        SeniorAccount wilson = new SeniorAccount("Anna", "Wilson", 1942,
                "234 Bauer street, Sarasota, Florida, 45632", Gender.FEMALE, LawfulStatus.UNDOCUMENTED,
                10);

        wilson.printInfo();
        System.out.println("********************************************");


    }
}
