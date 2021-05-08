package hw14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        /*
        Homework for Lesson 14 Sets, Maps, Iterator
        * Create three Hashmap - <String,String>, <Integer,String> and custom classes <Class1,Class2>;
        * Add four elements to each hashmap;
        * Try methods put/replace/remove/get/foreach
         */

        // <String,String> hashmap

        Map<String, String> profession = new HashMap<String, String>();
        profession.put("John Thomson", "Lawyer");
        profession.put("Sarah Wilson", "QA Engineer");
        profession.put("Angelina Simpson", "Dentist");
        profession.put("David Bauer", "Electrician");
        System.out.println();
        System.out.println("<String,String> hashmap:");
        System.out.println(profession);
        System.out.println("John Thomson is a " + profession.get("John Thomson"));
        System.out.println("David Bauer is a " + profession.get("David Bauer"));
        System.out.println("Angelina Simpson is a " + profession.get("Angelina Simpson"));
        profession.put("David Bauer", "Banker");
        System.out.println("David Bauer has changed his profession to: " + profession.get("David Bauer"));
        profession.put("Rosa Watson", "QA Engineer");
        System.out.println(profession);
        System.out.println("Rosa Watson as Sarah Wilson is a " + profession.get("Rosa Watson"));
        profession.replace("David Bauer", "Electrician");
        System.out.println("David Bauer decided to remain as a " + profession.get("David Bauer"));
        profession.remove("Rosa Watson");
        System.out.println(profession);

        System.out.println("*************************");

        System.out.println("Iteration through values:");
        for (String value : profession.values()) {
            System.out.println(value);

        }
        System.out.println("***********************");

        System.out.println("Iteration through keys:");
        for (String key : profession.keySet()) {
            System.out.println(key);

        }

        System.out.println("Iteration through key&values:");
        System.out.println("****************************");

        for (Map.Entry<String, String> entry : profession.entrySet()) {
            System.out.println(entry.getKey() + " is a " + entry.getValue());
        }
        System.out.println("*****************************");

        //<Integer,String> hashmap

        Map<Integer, String> weekdays = new HashMap<>();
        weekdays.put(1, "Monday");
        weekdays.put(2, "Tuesday");
        weekdays.put(3, "Wednesday");
        weekdays.put(4, "Thursday");
        weekdays.put(5, "Friday");
        weekdays.put(6, "Saturday");
        weekdays.put(7, "Sunday");
        System.out.println("<Integer,String> hashmap:");
        System.out.println(weekdays);
        System.out.println("There are " + weekdays.size() + " days in the week!");
        System.out.println(weekdays.get(1) + " is a 1st day of the week.");
        System.out.println(weekdays.get(3) + " is a 3rd day of the week.");
        weekdays.put(5, "Saturday");
        System.out.println(weekdays);
        System.out.println("Maybe, " + weekdays.get(5) + " is a 5th day of the week?");
        weekdays.replace(5, "Friday");
        System.out.println("No! " + weekdays.get(5) + " is a 5th day of the week!");

        System.out.println("**************************");

        System.out.println("Iteration through values:");
        for (String value : weekdays.values()) {
            System.out.println(value);

        }
        System.out.println("***********************");

        System.out.println("Iteration through keys:");
        for (Integer key : weekdays.keySet()) {
            System.out.println(key);
        }

        System.out.println("Iteration through key&values:");
        System.out.println("*****************************");

        for (Map.Entry<Integer, String> entry : weekdays.entrySet()) {
            System.out.println(entry.getKey() + " day in the week is " + entry.getValue());
        }

        // custom <Class1,Class2> hashmap

        Climate desert = new Climate("desert", "mild", "extreme hot");
        Climate mediterranean = new Climate("Mediterranean", "cool & wet", "hot & dry");
        Climate marine = new Climate("marine", "mild", "cool");
        Climate tropical = new Climate("tropical", "wet & humid", "dry & hot");

        Country saudiArabia = new Country("Saudi Arabia");
        Country spain = new Country("Spain");
        Country norway = new Country("Norway");
        Country indonesia = new Country("Indonesia");
        Country sudan = new Country("Sudan");
        Country italy = new Country("Italy");

        Map<Climate, Country> climateOfCountry = new HashMap<Climate, Country>();

        // put
        climateOfCountry.put(desert, saudiArabia);
        climateOfCountry.put(mediterranean, spain);
        climateOfCountry.put(marine, norway);
        climateOfCountry.put(tropical, indonesia);

        System.out.println("**********************************************************");
        for (Map.Entry<Climate, Country> entry : climateOfCountry.entrySet()) {
            System.out.println(entry.getValue().getName() + " has " + entry.getKey().getType() + " climate with "
                    + entry.getKey().getSummer() + " summer and " + entry.getKey().getWinter() + " winter");
        }
        // replace
        climateOfCountry.replace(desert, sudan);
        climateOfCountry.replace(mediterranean, italy);
        System.out.println("***********************************************************************");
        for (Map.Entry<Climate, Country> entry : climateOfCountry.entrySet()) {
            System.out.println(entry.getValue().getName() + " has " + entry.getKey().getType() + " climate with "
                    + entry.getKey().getSummer() + " summer and " + entry.getKey().getWinter() + " winter");
        }

        System.out.println("****************************************************************");
        System.out.println("Size is " + climateOfCountry.size());

        // remove
        climateOfCountry.remove(desert);
        System.out.println("**********************************************************");
        for (Map.Entry<Climate, Country> entry : climateOfCountry.entrySet()) {
            System.out.println(entry.getValue().getName() + " has " + entry.getKey().getType() + " climate with "
                    + entry.getKey().getSummer() + " summer and " + entry.getKey().getWinter() + " winter");
        }
    }
}
